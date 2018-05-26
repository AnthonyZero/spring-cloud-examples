package com.pingjin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pingjin.remote.UserFeignClient;

/**
 * @author pingjin create 2018年4月8日
 */
@RestController
public class MovieController {
	@Autowired
	private UserFeignClient userFeignClient;

	@SuppressWarnings("rawtypes")
	@GetMapping("/user/{id}")
	/* @HystrixCommand(fallbackMethod = "findByIdFallBack") */
	public Map findById(@PathVariable Long id) {
		return userFeignClient.findById(id);
	}

	public Map findByIdFallBack(Long id) {
		Map<String, Object> map = new HashMap<>();
		map.put("message", "容错回退");
		return map;
	}
}
