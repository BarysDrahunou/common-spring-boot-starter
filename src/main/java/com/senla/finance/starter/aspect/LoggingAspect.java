package com.senla.finance.starter.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

import static com.senla.finance.starter.utils.Constants.*;

@Aspect
@Slf4j
public abstract class LoggingAspect {
    protected void logMethodStart(JoinPoint joinPoint, String classType) {
        log.debug(METHOD_EXECUTION_LOG, classType, joinPoint.getSignature().toShortString());
        log.debug(PROVIDED_PARAMETERS_LOG, Arrays.toString(joinPoint.getArgs()));
    }

    protected void logMethodEnd(JoinPoint joinPoint, Object object, String classType) {
        log.debug(METHOD_EXECUTED_LOG, classType, joinPoint.getSignature().toShortString());
        log.debug(RETURN_VALUE_LOG, object);
    }

    protected void logMethodException(JoinPoint joinPoint, RuntimeException e, String classType) {
        log.debug(METHOD_EXECUTION_FAILED_LOG, classType, joinPoint.getSignature().toShortString());
        log.debug(EXCEPTION_LOG, e.getLocalizedMessage());
    }
}
