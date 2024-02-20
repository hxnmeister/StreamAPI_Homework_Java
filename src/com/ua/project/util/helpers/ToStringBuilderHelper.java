package com.ua.project.util.helpers;

import java.util.List;

public class ToStringBuilderHelper {
    public static String buildToString(final String message, final List<?> list) {
        StringBuilder builder = new StringBuilder(message);
        list.forEach(builder::append);

        return builder.toString();
    }
}
