package com.senla.finance.starter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import static com.senla.finance.starter.utils.Constants.SERVICE;

@Aspect
@Component
public class ServiceLoggingAspect extends LoggingAspect {
    @Before(value = "com.senla.finance.starter.aspect.SystemArchitecture.inServices()")
    public void logServiceCall(JoinPoint joinPoint) {
        logMethodStart(joinPoint, SERVICE);
    }

    @AfterReturning(value = "com.senla.finance.starter.aspect.SystemArchitecture.inServices()", returning = "object")
    public void logServiceResponse(JoinPoint joinPoint, Object object) {
        logMethodEnd(joinPoint, object, SERVICE);
    }

    @AfterThrowing(value = "com.senla.finance.starter.aspect.SystemArchitecture.inServices()", throwing = "e")
    public void logServiceException(JoinPoint joinPoint, RuntimeException e) {
        logMethodException(joinPoint, e, SERVICE);
    }
}
