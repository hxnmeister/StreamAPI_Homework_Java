package com.ua.project.task2.model;

import com.ua.project.task2.enums.Category;

public class Product {
    private String name;
    private Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return " Product: " + this.name +
                "\n Category: " + this.category.name().toLowerCase() + "\n" +
                "-".repeat(25) + "\n";
    }
}
