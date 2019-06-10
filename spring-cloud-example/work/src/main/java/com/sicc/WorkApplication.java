package com.sicc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Work ���ø����̼� (������Ʈ ���� �κ�)
 * @author Woongs
 */
@EnableEurekaClient
@SpringBootApplication
public class WorkApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class);
    }
}
