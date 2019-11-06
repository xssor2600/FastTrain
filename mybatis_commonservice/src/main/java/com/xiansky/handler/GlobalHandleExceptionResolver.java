package com.xiansky.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: xianl
 * @Date: 2019/11/6 14:56
 */
@Component
public class GlobalHandleExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object o, Exception e) {
		// 全局异常处理
		return null;
	}
}
