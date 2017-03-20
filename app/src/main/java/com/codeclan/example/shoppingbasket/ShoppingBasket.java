package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 18/03/2017.
 */

public class ShoppingBasket {

    Crunchie crunchie;
    Milk milk;
    Twix twix;
    private ArrayList<Item> items;

    public ShoppingBasket() {
        this.items = new ArrayList<Item>();
    }

    public int checkContents() {
        return items.size();
    }

    public void addOneItemToBasket(Item item) {
        items.add(twix);
    }

    public void removeOneItemFromBasket(Item item) {
        items.remove(twix);
    }

    public void clearBasket() {
        items.clear();
    }

    public double checkTotal(){
        double total = 0;
        for (Item product : this.items){
            total += product.getPrice();
        }
        return total;
    }

//    public double checkTotal() {
//        double Total = 0;
//        for (Item item : items) {
//            if (items.equals(crunchie)) {
//                Total += 1.0;
//            }else if (items.equals(twix)) {
//                Total += 1.5;
//            }else if (items.equals(milk)) {
//                Total += 2.0;
//            }
//        }
//        return Total;
//    }
}
