package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//服务注册
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println(
				"====================================================================================================================");
		System.out.println("");
		System.out.println("                                           服务提供者启动成功......");
		System.out.println("");
		System.out.println(
				"====================================================================================================================");
	}
}
