package com.ua.project.task4.models;

public class Projector {
    private int manufactureYear;
    private double price;
    private String name;
    private String manufacturer;

    public Projector(int manufactureYear, double price, String name, String manufacturer) {
        this.manufactureYear = manufactureYear;
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
    }
    public Projector(double price, String name) {
        this(1997, price, name, "ProjectorMANUFACTURER");
    }
    public Projector() {
        this(1.0, "ProjectorNAME");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return " Projector: " + this.name +
                "\n Manufacturer: " + this.manufacturer +
                "\n Manufacture Year: " + this.manufactureYear +
                "\n Price: " + this.price + "$\n" +
                "-".repeat(25) + "\n";
    }
}
