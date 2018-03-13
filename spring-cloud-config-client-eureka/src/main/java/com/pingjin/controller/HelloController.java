package com.pingjin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author pingjin create 2018年3月12日
 *
 */
@RestController
public class HelloController {

	//git server config 配置文件中的键
	@Value("${pingjin.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String sayHello() {
        return this.hello;
    }
}
