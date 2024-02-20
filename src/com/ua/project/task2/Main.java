package com.ua.project.task2;

import com.ua.project.task2.enums.Category;
import com.ua.project.task2.models.Product;
import com.ua.project.util.helpers.DisplayInfoHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String productName;
        Character productBeginsWith;
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<Product>(List.of(
                new Product("Yogurt", Category.MILK),
                new Product("Klun", Category.TEA),
                new Product("Beef", Category.MEAT),
                new Product("Kefir", Category.MILK),
                new Product("Jack", Category.CANDIES)
        ));
        Products products = new Products(productList);

        System.out.println(products);
        DisplayInfoHelper.displayList(products.getProductsByNameLength(5), " Products with name length less than 5:\n", "=");

        System.out.print(" Enter name of product to search: ");
        productName = scanner.nextLine();

        DisplayInfoHelper.displayList(products.getProductsByName(productName), " Products with name \"" + productName + "\":\n", "=");

        System.out.print(" Enter character to search product: ");
        productBeginsWith = scanner.nextLine().charAt(0);

        DisplayInfoHelper.displayList(products.getProductsWithNameFirstChar(productBeginsWith), " Products starts with \"" + productBeginsWith + "\":\n", "=");
        DisplayInfoHelper.displayList(products.getProductsByCategory("Milk"), " Products from category milk:\n", "=");

    }
}
