package com.ua.project.task4;

import com.ua.project.task4.models.Projector;
import com.ua.project.util.helpers.ToStringBuilderHelper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Projectors {
    private List<Projector> projectors;

    public Projectors(List<Projector> projectors) {
        this.projectors = projectors;
    }
    public Projectors() {
        this(new ArrayList<Projector>());
    }

    public List<Projector> getProjectors() {
        return projectors;
    }

    public void setProjectors(List<Projector> projectors) {
        this.projectors = projectors;
    }

    public List<Projector> getProjectorsByManufacturer(final String manufacturer) {
        return projectors.stream().filter((projector) -> projector.getManufacturer().equalsIgnoreCase(manufacturer)).toList();
    }

    public List<Projector> getProjectorsByManufactureYear(final int manufactureYear) {
        return projectors.stream().filter((projector) -> projector.getManufactureYear() == manufactureYear).toList();
    }

    public List<Projector> getProjectorsByHigherPrice(final double price) {
        return projectors.stream().filter((projector) -> projector.getPrice() > price).toList();
    }

    public List<Projector> getSortedByPriceProjectorsAsc() {
        return projectors.stream().sorted(Comparator.comparing(Projector::getPrice)).toList();
    }

    public List<Projector> getSortedByPriceProjectorsDesc() {
        return projectors.stream().sorted(Comparator.comparing(Projector::getPrice).reversed()).toList();
    }

    public List<Projector> getSortedByManufactureYearProjectorsAsc() {
        return projectors.stream().sorted(Comparator.comparing(Projector::getManufactureYear)).toList();
    }

    public List<Projector> getSortedByManufactureYearProjectorsDesc() {
        return projectors.stream().sorted(Comparator.comparing(Projector::getManufactureYear).reversed()).toList();
    }

    @Override
    public String toString() {
        return ToStringBuilderHelper.buildToString(" PROJECTORS:\n", projectors);
    }
}
