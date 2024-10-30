package com.senla.finance.starter.utils;

import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class Constants {

    public static final String METHOD_EXECUTION_LOG = "Executing {} method {}";
    public static final String METHOD_EXECUTED_LOG = "Executed {} method {}";
    public static final String METHOD_EXECUTION_FAILED_LOG = "Execution of {} method {} failed";
    public static final String PROVIDED_PARAMETERS_LOG = "Provided parameters are: {}";
    public static final String RETURN_VALUE_LOG = "Return value is: {}";
    public static final String EXCEPTION_LOG = "An exception '{}' has been thrown";

    public static final String CONTROLLER = "controller";
    public static final String SERVICE = "service";
    public static final String DAO = "dao";

    @Value("${properties.to.mask}")
    public static final List<String> PROPERTIES_TO_MASK = new ArrayList<>();

}
