package com.ua.project.util.helpers;

import java.util.List;

public class DisplayInfoHelper {
    public static void displayList(final List<?> list, final String message, final String separator) {
        System.out.print(message);
        list.forEach((item) -> System.out.print(item + " "));
        System.out.println("\n Count: " + list.size());
        System.out.println(separator.repeat(20));
    }
}
