package com.ua.project.task2;

import com.ua.project.task2.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> products;

    public Products(List<Product> products) {
        this.products = products;
    }
    public Products() {
        this(new ArrayList<Product>());
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProductsByNameLength(final int length) {
        return this.products.stream().filter((product) -> product.getName().length() < length).toList();
    }

    public List<Product> getProductsByName(final String name) {
        return this.products.stream().filter((product) -> product.getName().equalsIgnoreCase(name)).toList();
    }

    public List<Product> getProductsWithNameFirstChar(final Character character) {
        return this.products.stream().filter((product) -> product.getName().toLowerCase().startsWith(character.toString().toLowerCase())).toList();
    }

    public List<Product> getProductsByCategory(final String category) {
        return this.products.stream().filter((product) -> product.getCategory().name().equalsIgnoreCase(category)).toList();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(" PRODUCTS:\n\n");
        products.forEach(builder::append);

        return builder.toString();
    }
}
