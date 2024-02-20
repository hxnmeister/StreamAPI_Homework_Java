package com.ua.project.task3;

import com.ua.project.task3.enums.Color;
import com.ua.project.task3.enums.Type;
import com.ua.project.task3.models.Device;
import com.ua.project.util.helpers.DisplayInfoHelper;
import com.ua.project.util.helpers.InputHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int integerInput;
    private static int[] integerRange;
    private static double doubleInput;
    private static String inputString;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Device> deviceList = new ArrayList<Device>(List.of(
                new Device(2000, 341.33, Type.PHONE, Color.ROSE_GOLD, "Galaxy S9"),
                new Device(2002, 123.4, Type.CONSOLE, Color.BLACK, "Xbox Series"),
                new Device(2001, 215.61, Type.DESKTOP, Color.GOLD, "DESK 1504"),
                new Device(2005, 987.99, Type.PHONE, Color.GRAY, "iPhone 6"),
                new Device(2002, 156.3, Type.LAPTOP, Color.BLACK, "Legion X7"),
                new Device(2001, 334.23, Type.PHONE, Color.GREEN, "Moto K98")
        ));
        Devices devices = new Devices(deviceList);

        System.out.println(devices);
        System.out.println("-".repeat(50));

        inputString = InputHelper.getEnumInput(Color.values(), "\n Enter color to search: ");
        DisplayInfoHelper.displayList(devices.getDevicesByColor(inputString), " Devices by color \"" + inputString + "\":\n", "=");

        integerInput = InputHelper.getPositiveIntegerInput("\n Enter manufacturer year to search: ");
        DisplayInfoHelper.displayList(devices.getDeviceByManufactureYear(integerInput), " Devices by manufacture year:\n", "=");

        doubleInput = InputHelper.getPositiveDoubleInput("\n Enter price to search: ");
        DisplayInfoHelper.displayList(devices.getDeviceByHigherPrice(doubleInput), " Devices by higher than \"" + doubleInput + "\" price:\n", "=");

        inputString = InputHelper.getEnumInput(Type.values(), "\n Enter type to search: ");
        DisplayInfoHelper.displayList(devices.getDeviceByType(inputString), " Devices by type \"" + inputString + "\":\n", "=");

        integerRange = InputHelper.getIntegerRangeInput("\n In fields below enter manufacture year range to search:");
        DisplayInfoHelper.displayList(devices.getDeviceByManufactureYearRange(integerRange[0], integerRange[1]), " Devices by manufacture year range:\n", "=");
    }
}
