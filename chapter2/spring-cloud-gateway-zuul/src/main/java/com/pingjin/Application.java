package com.pingjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pingjin.filter.PreRequestLogFilter;

/* 路由查看 http://localhost:8040/routes */
@SpringBootApplication
@EnableZuulProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public PreRequestLogFilter preRequestLogFilter() {
		return new PreRequestLogFilter();
	}
}
