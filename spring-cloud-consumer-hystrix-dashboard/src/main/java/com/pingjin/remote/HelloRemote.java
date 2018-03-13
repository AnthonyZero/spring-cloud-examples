package com.pingjin.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//name:远程服务名，及spring.application.name配置的名称
//添加指定fallback类，在服务熔断的时候返回fallback类中的内容
@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

	/**
	 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
