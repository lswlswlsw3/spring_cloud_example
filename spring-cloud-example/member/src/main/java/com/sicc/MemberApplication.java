package com.sicc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Member ���ø����̼� (������Ʈ ���� �κ�)
 * @author Woongs
 */
@EnableEurekaClient // ����ī Ŭ���̾�Ʈ ����
@EnableCircuitBreaker // ��Ŷ�극��Ŀ ����
@SpringBootApplication
public class MemberApplication {
	
	// RestTemplate �߰�
	@LoadBalanced // ribbon ����� ���� ������̼� �߰�
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class);
    }
}
