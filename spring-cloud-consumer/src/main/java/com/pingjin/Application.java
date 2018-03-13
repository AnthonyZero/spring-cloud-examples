package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication 
@EnableDiscoveryClient //启用服务注册与发现
@EnableFeignClients //启用feign进行远程调用
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println(
				"====================================================================================================================");
		System.out.println("");
		System.out.println("                                           服务消费者启动成功......");
		System.out.println("");
		System.out.println(
				"====================================================================================================================");
	}
}
