package com.senla.finance.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoggingAutoConfiguration {
    @Bean(name = "customBean")
    public String userManager() {
        return "UserManager bean start to create.";
    }
}
