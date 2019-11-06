package com.xiansky.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: xianl
 * @Date: 2019/11/6 14:53
 */

@ControllerAdvice
public class GlobalExceptionHandler {


	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Object resolveException(Exception e){
		// 异常处理
		return null;
	}


	@ResponseBody
	@ExceptionHandler(value = NullPointerException.class)
	public Object resolverNPE(NullPointerException e){

		return null;
	}
}
