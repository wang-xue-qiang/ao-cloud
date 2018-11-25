package com.zkh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@EnableTurbine
@SpringBootApplication
@EnableApolloConfig
public class TurbineApplication {
  public static void main(String[] args) {
    SpringApplication.run(TurbineApplication.class, args);
  }
}
