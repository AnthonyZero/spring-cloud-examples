package com.pingjin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author pingjin create 2018年3月12日
 *
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
//post请求的方式来访问http://localhost:9011/refresh 就会更新修改后的配置文件(postman 或者 github的webhook)
public class HelloController {

	//git server config 配置文件中的键
	@Value("${pingjin.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String sayHello() {
        return this.hello;
    }
}
