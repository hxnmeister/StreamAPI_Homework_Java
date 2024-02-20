package com.ua.project.task4;

import com.ua.project.task4.models.Projector;
import com.ua.project.util.helpers.DisplayInfoHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Projector> projectorList = new ArrayList<Projector>(List.of(
                new Projector(2000, 123.45, "PowerPlant", "DELL"),
                new Projector(2002, 331.11, "Projectorio", "Samsung"),
                new Projector(2001, 137.3, "Magician", "Xiaomi"),
                new Projector(2005, 987.99, "Imposter", "DELL"),
                new Projector(2002, 122.65, "PowerPlant", "LG"),
                new Projector(2000, 53.4, "Porjectorio", "DELL")
        ));
        Projectors projectors = new Projectors(projectorList);

        System.out.println(projectors);
        System.out.println("-".repeat(50));

        DisplayInfoHelper.displayList(projectors.getProjectorsByManufacturer("DELL"), " Projectors by manufacturer DELL:\n", "=");
        DisplayInfoHelper.displayList(projectors.getProjectorsByManufactureYear(2000), " Projectors by manufacture year 2000:\n", "=");
        DisplayInfoHelper.displayList(projectors.getProjectorsByHigherPrice(125), " Projectors by higher than 125.0 price:\n", "=");
        DisplayInfoHelper.displayList(projectors.getSortedByPriceProjectorsAsc(), " Projectors sorted by price asc:\n", "=");
        DisplayInfoHelper.displayList(projectors.getSortedByPriceProjectorsDesc(), " Projectors sorted by price desc:\n", "=");
        DisplayInfoHelper.displayList(projectors.getSortedByManufactureYearProjectorsAsc(), " Projectors sorted by manufacture year asc:\n", "=");
        DisplayInfoHelper.displayList(projectors.getSortedByManufactureYearProjectorsDesc(), " Projectors sorted by manufacture year desc:\n", "=");
    }
}
