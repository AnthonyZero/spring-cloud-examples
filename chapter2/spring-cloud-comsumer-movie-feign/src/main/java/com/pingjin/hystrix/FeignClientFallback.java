package com.pingjin.hystrix;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.pingjin.remote.UserFeignClient;

@Component
public class FeignClientFallback implements UserFeignClient {

	@Override
	public Map findById(Long id) {
		Map<String, Object> map = new HashMap<>();
		map.put("message", "容错回退");
		return map;
	}

}
