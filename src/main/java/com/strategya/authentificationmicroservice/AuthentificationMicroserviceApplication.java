package com.strategya.authentificationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableAsync
public class AuthentificationMicroserviceApplication {

    public static void main(String[] args)  {
        SpringApplication.run(AuthentificationMicroserviceApplication.class, args);
    }

}
