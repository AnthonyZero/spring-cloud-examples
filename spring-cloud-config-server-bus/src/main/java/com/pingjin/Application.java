package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

//启动类添加@EnableDiscoveryClient激活对配置中心的支持
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println(
				"====================================================================================================================");
		System.out.println("");
		System.out.println("                                           Git Config Server启动成功......");
		System.out.println("");
		System.out.println(
				"====================================================================================================================");
	}
}
