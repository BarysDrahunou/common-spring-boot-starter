package com.senla.finance.starter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import static com.senla.finance.starter.utils.Constants.DAO;

@Aspect
@Component
public class DaoLoggingAspect extends LoggingAspect {
    @Before(value = "com.senla.finance.starter.aspect.SystemArchitecture.inDao()")
    public void logDaoCall(JoinPoint joinPoint) {
        logMethodStart(joinPoint, DAO);
    }

    @AfterReturning(value = "com.senla.finance.starter.aspect.SystemArchitecture.inDao()", returning = "object")
    public void logDaoResponse(JoinPoint joinPoint, Object object) {
        logMethodEnd(joinPoint, object, DAO);
    }

    @AfterThrowing(value = "com.senla.finance.starter.aspect.SystemArchitecture.inDao()", throwing = "e")
    public void logDaoException(JoinPoint joinPoint, RuntimeException e) {
        logMethodException(joinPoint, e, DAO);
    }
}
