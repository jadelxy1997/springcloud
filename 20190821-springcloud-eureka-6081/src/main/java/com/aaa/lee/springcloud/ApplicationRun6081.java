package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/22 10:32
 * @Description
 *      @EnableEurekaServer:开启eureka的服务器端
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun6081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6081.class, args);
    }

}
