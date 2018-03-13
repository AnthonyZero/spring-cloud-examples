package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pingjin.filter.TokenFilter;

//Zuul会代理所有注册到Eureka Server的微服务，并且Zuul的路由规则如下：
//http://ZUUL_HOST:ZUUL_PORT/微服务在Eureka上的serviceId/**会被转发到serviceId对应的微服务
//http://localhost:8988/spring-cloud-producer/hello?name='小进同志'
@SpringBootApplication
@EnableZuulProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println(
				"====================================================================================================================");
		System.out.println("");
		System.out.println("                                           服务网关Zuul启动成功......");
		System.out.println("");
		System.out.println(
				"====================================================================================================================");
	}
	
	/**
	 * 将TokenFilter加入到请求拦截队列
	 * @return
	 */
	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}
}
