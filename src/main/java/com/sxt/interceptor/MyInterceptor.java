package com.sxt.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	//在Controller中的业务处理方法之前执行(方法返回值为false则目标方法不会执行，否则才会执行)
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		System.out.println("准备执行目标方法。。。。");
		return true;
	}
	
	//在Controller中的业务处理方法之后,返回ModelAndView之间执行，此时视图组件还没运行(此处可以往ModelAndView中添加一些公共的模型及视图数据)
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj, ModelAndView mv) throws Exception {
		System.out.println("目标方法执行完毕，视图渲染之前执行。。。。。");
	}
	
	//在视图渲染之后执行，此时请求/响应完整结束(此处可以做一些公共的扫尾工作，如日志记录，异常处理等 )
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception ex)
			throws Exception {
		 System.out.println("视图渲染完毕，请求/响应结束。。。。。");
	}

	

	

}
