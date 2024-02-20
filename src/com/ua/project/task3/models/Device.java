package com.ua.project.task3.models;

import com.ua.project.task3.enums.Color;
import com.ua.project.task3.enums.Type;

public class Device {
    private int manufactureYear;
    private double price;
    private Type type;
    private Color color;
    private String name;

    public Device(int manufactureYear, double price, Type type, Color color, String name) {
        this.manufactureYear = manufactureYear;
        this.price = price;
        this.type = type;
        this.color = color;
        this.name = name;
    }
    public Device(double price, Type type, Color color, String name) {
        this(1997, price, type, color, name);
    }
    public Device() {
        this(1997, 1.0, Type.PHONE, Color.BLACK, "DeviceNAME");
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Device: " + this.name +
                "\n Type: " + this.type.name().toLowerCase() +
                "\n Color: " + this.color.name().replace("_", " ").toLowerCase() +
                "\n Manufacture Year: " + this.manufactureYear +
                "\n Price: " + this.price + "$\n" +
                "-".repeat(25) + "\n";
    }
}
