package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 19/03/2017.
 */

public abstract class Item implements ISell {

    private String name;

//    look up types again
    private String type;

    public Item (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
