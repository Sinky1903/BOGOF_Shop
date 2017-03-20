package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 19/03/2017.
 */

public class Twix extends Item {

    public Twix(String name) {
        super(name);
    }

    private double price = 1.5;

    public double getPrice() {
        return price;
    }
}


