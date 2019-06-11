package com.sicc.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/**
 * Feign�� Hystrix fallback exception ���� �ľ��� ���� Ŭ����
 * @author Woongs
 */
@Component
public class FeignWorkRemoteServiceFallbackFactory
		implements FallbackFactory<FeignWorkRemoteService> {
	/**
	 * fallback exception ���� �ľ��� ���� �޼ҵ�
	 * @author Woongs
	 */
	@Override
	public FeignWorkRemoteService create(Throwable cause) {
		System.out.println("exception = "+cause);
		return workId -> "[ this work is finished ]";
	}
}
