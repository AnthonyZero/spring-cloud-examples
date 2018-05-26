package com.pingjin.remote;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pingjin.config.FeignLogConfiguration;
import com.pingjin.hystrix.FeignClientFallbackFactory;

@FeignClient(name = "spring-cloud-simple-provider-user", configuration = FeignLogConfiguration.class,
		fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {

	@SuppressWarnings("rawtypes")
	@RequestMapping("/{id}")
	public Map findById(@PathVariable("id") Long id);
}
