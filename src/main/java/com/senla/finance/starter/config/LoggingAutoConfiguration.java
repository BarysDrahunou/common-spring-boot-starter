package com.senla.finance.starter.config;

import com.senla.finance.starter.aspect.ControllerLoggingAspect;
import com.senla.finance.starter.aspect.DaoLoggingAspect;
import com.senla.finance.starter.aspect.ServiceLoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoggingAutoConfiguration {
    @Bean(name = "customBean")
    public String userManager() {
        return "UserManager bean start to create.";
    }

    @Bean
    public ControllerLoggingAspect controllerLoggingAspect(){
        return new ControllerLoggingAspect();
    }

    @Bean
    public DaoLoggingAspect daoLoggingAspect(){
        return new DaoLoggingAspect();
    }

    @Bean
    public ServiceLoggingAspect serviceLoggingAspect(){
        return new ServiceLoggingAspect();
    }
}
