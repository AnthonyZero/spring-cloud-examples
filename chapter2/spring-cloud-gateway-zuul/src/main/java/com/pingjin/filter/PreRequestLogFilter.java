package com.pingjin.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreRequestLogFilter extends ZuulFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);
	
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println(request.getMethod());
		System.out.println(request.getRequestURI().toString());
		LOGGER.info(String.format("send &s request to %s", request.getMethod(), 
				request.getRequestURI().toString()));
		return null;
		
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
