package com.sicc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Member ���ø����̼� (������Ʈ ���� �κ�)
 * @author Woongs
 */
@SpringBootApplication
public class MemberApplication {
	
	// RestTemplate �߰�
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class);
    }
}
