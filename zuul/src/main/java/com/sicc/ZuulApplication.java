package com.sicc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul ������Ʈ ������ (������̼� �������� zuul ��� �����ϵ���)
 * @author Woongs
 */
@EnableZuulProxy		// zuulProxy ����
@EnableDiscoveryClient	// discoveryClient ����
@SpringBootApplication
public class ZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
