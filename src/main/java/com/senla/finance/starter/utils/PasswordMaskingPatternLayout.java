package com.senla.finance.starter.utils;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;

import static com.senla.finance.starter.utils.Constants.PROPERTIES_TO_MASK;

public class PasswordMaskingPatternLayout extends PatternLayout {

    public static final String CAPTURING_REGEX = "\\S*?(?=, |$)";
    public static final String MASKED_PROPERTY = "*******";

    @Override
    public String doLayout(ILoggingEvent event) {
        String input = super.doLayout(event);

        for (String property : PROPERTIES_TO_MASK) {
            input = input.replaceAll(property + CAPTURING_REGEX, property + MASKED_PROPERTY);
        }

        return input;
    }
}
