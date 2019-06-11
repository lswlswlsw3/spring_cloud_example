package com.sicc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Feign�� �̿� Work ������Ʈ ȣ�� �������̽�
 * @author Woongs
 *
 */
//@FeignClient(name="work", url="http://localhost:8082/") // Feighn ��Ī, ��� ����
//Feign + Eureka + Ribbon ����, fallback, fallback Factory �߰�
@FeignClient(name="work",
	//fallback=FeignWorkRemoteServiceFallbackImpl.class,
	fallbackFactory=FeignWorkRemoteServiceFallbackFactory.class)
public interface FeignWorkRemoteService {
	@RequestMapping(path="/works/{workId}")
	String getWorkInfo(@PathVariable("workId") String workId);
}
