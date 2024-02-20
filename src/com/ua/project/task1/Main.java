package com.ua.project.task1;

import com.ua.project.util.helpers.DisplayInfoHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>(List.of(-121, 225, 4224, -15, 562, 898, -1441, 25, -99));
        RandomNumbers randomNumbers = new RandomNumbers();
        RandomNumbers randomNumbers1 = new RandomNumbers(integerList);

        displayRandomNumbers(randomNumbers, "-");
        displayRandomNumbers(randomNumbers1, "=");
    }

    private static void  displayRandomNumbers(final RandomNumbers randomNumbers, final String separator) {
        System.out.println(randomNumbers);
        System.out.println(separator.repeat(50));

        DisplayInfoHelper.displayList(randomNumbers.getPositiveNumbers(), " Positive Numbers: ", separator);
        DisplayInfoHelper.displayList(randomNumbers.getNegativeNumbers(), " Negative Numbers: ", separator);
        DisplayInfoHelper.displayList(randomNumbers.getDoubleFigures(), " Double Figures Numbers: ", separator);
        DisplayInfoHelper.displayList(randomNumbers.getMirrorNumbers(), " Mirror Numbers: ", separator);
    }
}
