package com.pingjin.hystrix;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pingjin.remote.UserFeignClient;

import feign.hystrix.FallbackFactory;

/**
 * @author pingjin create 2018年5月6日
 */
@Component
public class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

	private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);
	@Override
	public UserFeignClient create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new UserFeignClient() {

			@Override
			public Map findById(Long id) {
				LOGGER.info("Fallback;reason was:", arg0);
				Map<String, Object> map = new HashMap<>();
				map.put("message", "容错回退");
				map.put("fallback-reason", arg0.getMessage());
				return map;
			}
		};
	}

}
