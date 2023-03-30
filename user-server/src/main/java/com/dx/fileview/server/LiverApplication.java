package com.dx.fileview.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xmc
 * @version 1.0
 * @date 2023/3/25 10:22:24
 * @since jdk17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LiverApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiverApplication.class,args);
    }
}
