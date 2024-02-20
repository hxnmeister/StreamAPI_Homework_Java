package com.ua.project.util.helpers;

import com.ua.project.task3.exceptions.IncorrectRangeException;
import org.w3c.dom.ranges.RangeException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getPositiveIntegerInput(final String inputMessage) {
        while(true) {
            try {
                System.out.print(inputMessage);
                return SCANNER.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\n Please enter a number!");
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static double getPositiveDoubleInput(final String inputMessage) {
        while(true) {
            try {
                System.out.print(inputMessage);
                return SCANNER.nextDouble();
            }
            catch (InputMismatchException e) {
                System.out.println("\n Please enter a float number!");
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String getEnumInput(final Enum<?>[] enums, final String inputMessage) {
        while(true) {
            try {
                System.out.print(inputMessage);
                final String tempString = SCANNER.nextLine();

                if(Arrays.stream(enums).anyMatch((item) -> tempString.equalsIgnoreCase(item.name().replace("_", " ")))) {
                    return tempString;
                }

                throw new IllegalArgumentException("\n Your input \"" + tempString + "\" incorrect, try again!");
            }
            catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print(" Available values: ");
                Arrays.stream(enums).forEach((item) -> System.out.print(item.name().replace("_", " ").toLowerCase() + "; "));
                System.out.println();
            }
            catch(RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int[] getIntegerRangeInput(final String inputMessage) {
        int rangeStart;
        int rangeEnd;

        while(true) {
            try {
                System.out.print(inputMessage);

                rangeStart = getPositiveIntegerInput("\n Enter range start: ");
                rangeEnd = getPositiveIntegerInput("\n Enter range end: ");

                if(rangeEnd < rangeStart) {
                    throw new IncorrectRangeException(rangeStart, rangeEnd);
                }

                return new int[] {rangeStart, rangeEnd};
            }
            catch(IncorrectRangeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
