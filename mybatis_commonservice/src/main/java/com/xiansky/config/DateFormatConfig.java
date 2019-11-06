package com.xiansky.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xianl
 * @Date: 2019/11/6 10:36
 * 全局日期格式化
 */
@JsonComponent
public class DateFormatConfig {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


	/**
	 * 日期格式化
	 * json序列化接口JsonSerializer 将日期转换成字符串
	 */
	public static class DateJsonSerializer extends JsonSerializer<Date>{

		@Override
		public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
				throws IOException {
			jsonGenerator.writeString(dateFormat.format(date));
		}
	}

	/**
	 * Json反序列接口JsonDeserializer
	 * 将字符串反序列化成date
	 */
	public static class DateJsonDeserializer extends JsonDeserializer<Date>{

		@Override
		public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
				throws IOException, JsonProcessingException {
			try {
				return dateFormat.parse(jsonParser.getText());
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}
	}


}
