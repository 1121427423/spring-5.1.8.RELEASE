package com.king.learning.beans;

import lombok.Data;

/**
 * @author king
 * @version 1.0
 * @className Address
 * @description TODO
 * @date 2022/5/16
 */
public class Address {

    public Address() {

    }

    public Address(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    /**
     * 地名
     */
    private String name;

    /**
     * 位置信息
     */
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
