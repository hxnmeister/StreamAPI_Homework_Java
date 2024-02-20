package com.ua.project.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    private List<Integer> values;

    public RandomNumbers(List<Integer> values) {
        this.values = values;
    }
    public RandomNumbers(int countOfValues) {
        this(randomizeValues(countOfValues));
    }
    public RandomNumbers() {
        this(randomizeValues(10));
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public static List<Integer> randomizeValues(final int countOfValues) {
        Random random = new Random();
        List<Integer> tempList = new ArrayList<Integer>();

        for (int i = 0; i < countOfValues; i++) {
            tempList.add(random.nextInt(-5000, 5000));
        }

        return tempList;
    }

    public List<Integer> getPositiveNumbers() {
        return this.values.stream().filter((value) -> value >= 0).toList();
    }

    public List<Integer> getNegativeNumbers() {
        return this.values.stream().filter((value) -> value < 0).toList();
    }

    public List<Integer> getDoubleFigures() {
        return this.values.stream().filter(RandomNumbers::isDoubleFigures).toList();
    }

    public List<Integer> getMirrorNumbers() {
        return this.values.stream().filter(RandomNumbers::isMirrorNumber).toList();
    }

    private static boolean isMirrorNumber(final int number) {
        StringBuilder builder = new StringBuilder(String.valueOf(number).replace("-", ""));

        return builder.toString().contentEquals(builder.reverse());
    }

    private static boolean isDoubleFigures(final int number) {
        return ((number / 10 > 0) && (number / 10 < 10)) || (number / 10 > -10) && (number / 10 < 0);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(" Array of numbers: ");
        values.forEach((value) -> builder.append(value).append(" "));

        return builder.toString();
    }
}
