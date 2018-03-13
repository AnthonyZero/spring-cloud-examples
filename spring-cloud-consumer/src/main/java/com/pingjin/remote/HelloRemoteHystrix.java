package com.pingjin.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author pingjin create 2018年3月12日
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "hello " +name+", this messge send failed ";
	}

}
