package com.zkh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
public class FileUploadApplication {
  public static void main(String[] args) {
    SpringApplication.run(FileUploadApplication.class, args);
  }
}
