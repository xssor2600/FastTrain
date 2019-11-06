package com.xiansky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;

/**
 * @Author: xianl
 * @Date: 2019/11/5 17:13
 */
@SpringBootApplication
public class CommonServiceApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context = SpringApplication.run(CommonServiceApplication.class);
		AbstractEnvironment environment = (AbstractEnvironment) context.getBean(Environment.class);
		System.out.println(environment);
	}
}
