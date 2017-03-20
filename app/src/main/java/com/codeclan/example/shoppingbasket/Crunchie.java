package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 19/03/2017.
 */

public class Crunchie extends Item {

    public Crunchie(String name) {
        super(name);
    }

    private double price = 1.0;

    public double getPrice() {
        return price;
    }

}
