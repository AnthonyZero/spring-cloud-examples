package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 访问http://localhost:8060/hystrix 进入Dashboard界面
 * url上输入 http://localhost:8060/turbine.stream 点击Monitor Stream
 * @author pingjin create 2018年5月6日
 *
 */
@SpringBootApplication
@EnableTurbine // 聚合微服务监控数据
@EnableHystrixDashboard // 展示Dashboard面板
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
