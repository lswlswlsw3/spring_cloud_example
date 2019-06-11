package com.sicc.service;

import org.springframework.stereotype.Component;

/**
 * Feign�� Hystrix fallback ���� Ŭ����
 * @author Woongs
 *
 */
@Component
public class FeignWorkRemoteServiceFallbackImpl implements FeignWorkRemoteService {
	@Override
	public String getWorkInfo(String workId) {
		return "[ this work is finished ]";
	}
}
