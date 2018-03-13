package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

/**
 * 
 * @author pingjin create 2018年3月13日
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer //使用了@EnableZipkinServer注解，启用Zipkin服务
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println(
				"====================================================================================================================");
		System.out.println("");
		System.out.println("                                           Zipkin Server启动成功......");
		System.out.println("");
		System.out.println(
				"====================================================================================================================");
	}
}
