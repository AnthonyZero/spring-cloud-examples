package com.pingjin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
 * @author pingjin create 2018年4月8日
 */
@Configuration
public class FeignLogConfiguration {

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.BASIC;
	}
}
