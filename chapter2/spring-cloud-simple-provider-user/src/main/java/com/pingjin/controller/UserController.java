package com.pingjin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pingjin create 2018年3月14日
 */
@RestController
public class UserController {

	@SuppressWarnings("rawtypes")
	@RequestMapping("/{id}")
	public Map findById(@PathVariable Long id) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("username", "张三");
		map.put("sex", "男");
		map.put("age", 20);
		return map;
	}
}
