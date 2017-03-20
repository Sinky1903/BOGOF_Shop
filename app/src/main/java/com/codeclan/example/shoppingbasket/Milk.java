package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 19/03/2017.
 */

public class Milk extends Item {

    public Milk(String name) {
        super(name);
    }

    private double price = 2.5;

    public double getPrice() {
        return price;
    }
}
