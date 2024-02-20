package com.ua.project.task3;

import com.ua.project.task3.models.Device;
import com.ua.project.util.helpers.ToStringBuilderHelper;

import java.util.ArrayList;
import java.util.List;

public class Devices {
    private List<Device> devices;

    public Devices(List<Device> devices) {
        this.devices = devices;
    }
    public Devices() {
        this(new ArrayList<Device>());
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevicesByColor(final String color) {
        return devices.stream().filter((device) -> device.getColor().name().replace("_", " ").equalsIgnoreCase(color)).toList();
    }

    public List<Device> getDeviceByManufactureYear(final int manufactureYear) {
        return devices.stream().filter((device) -> device.getManufactureYear() == manufactureYear).toList();
    }

    public List<Device> getDeviceByHigherPrice(final double price) {
        return devices.stream().filter((device) -> device.getPrice() > price).toList();
    }

    public List<Device> getDeviceByType(final String type) {
        return devices.stream().filter((device) -> device.getType().name().replace("_", " ").equalsIgnoreCase(type)).toList();
    }

    public List<Device> getDeviceByManufactureYearRange(final int rangeBegin, final int rangeEnd) {
        return devices.stream().filter((device) -> device.getManufactureYear() > rangeBegin && device.getManufactureYear() < rangeEnd).toList();
    }

    @Override
    public String toString() {
        return ToStringBuilderHelper.buildToString(" DEVICES:\n", devices);
    }
}
