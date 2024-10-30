package com.senla.finance.starter.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitecture {

    @Pointcut("within(@com.senla.finance.starter.annotations.LogController *)")
    public void inControllers() {}

    @Pointcut("within(@com.senla.finance.starter.annotations.ServiceController *)")
    public void inServices() {
    }

    @Pointcut("within(@com.senla.finance.starter.annotations.DaoController *)")
    public void inDao() {
    }
}
