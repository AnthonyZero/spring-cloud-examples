package com.pingjin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author pingjin create 2018年3月27日
 */
@RestController
@RequestMapping
public class MovieController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

	@SuppressWarnings("rawtypes")
	@GetMapping("/user/{id}")
	public Map findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://spring-cloud-simple-provider-user/" + id, Map.class);
	}

	@GetMapping("/user-instance")
	public List<ServiceInstance> showInfo() {
		return this.discoveryClient.getInstances("spring-cloud-simple-provider-user");
	}

	@GetMapping("/log-user-instance")
	public void logUserInstance() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("spring-cloud-simple-provider-user");
		MovieController.LOGGER.info("{}:{}:{}",serviceInstance.getServiceId(),
				serviceInstance.getHost(),serviceInstance.getPort());	
	}
}
