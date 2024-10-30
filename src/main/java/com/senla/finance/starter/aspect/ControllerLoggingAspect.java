package com.senla.finance.starter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import static com.senla.finance.starter.utils.Constants.*;

@Aspect
public class ControllerLoggingAspect extends LoggingAspect {
    @Before(value = "com.senla.finance.starter.aspect.SystemArchitecture.inControllers()")
    public void logRequest(JoinPoint joinPoint) {
        logMethodStart(joinPoint, CONTROLLER);
    }

    @AfterReturning(value = "com.senla.finance.starter.aspect.SystemArchitecture.inControllers()", returning = "object")
    public void logResponse(JoinPoint joinPoint, Object object) {
        logMethodEnd(joinPoint, object, CONTROLLER);
    }

    @AfterThrowing(value = "com.senla.finance.starter.aspect.SystemArchitecture.inControllers()", throwing = "e")
    public void logControllerException(JoinPoint joinPoint, RuntimeException e) {
        logMethodException(joinPoint, e, CONTROLLER);
    }
}
