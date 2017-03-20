package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class TestShoppingBasket {

    ShoppingBasket basket;
    Item item;
    Crunchie crunchie;
    Milk milk;
    Twix twix;


    @Before
    public void before() {
        crunchie = new Crunchie("crunchie");
        milk = new Milk("milk");
        twix = new Twix("twix");
        basket = new ShoppingBasket();
    }

    @Test
    public void testBasketEmpty() {
        assertEquals(0, basket.checkContents());
    }

    @Test
    public void testOneItemInBasket() {
        basket.addOneItemToBasket(twix);
        assertEquals(1, basket.checkContents());
    }

    @Test
    public void testTwoItemsInBasket() {
        basket.addOneItemToBasket(twix);
        basket.addOneItemToBasket(crunchie);
        assertEquals(2, basket.checkContents());
    }

    @Test
    public void testRemoveItemFromBasket() {
        basket.addOneItemToBasket(twix);
        basket.removeOneItemFromBasket(twix);
        assertEquals(0, basket.checkContents());
    }

    @Test
    public void testClearItemsFromBasket() {
        basket.addOneItemToBasket(twix);
        basket.addOneItemToBasket(milk);
        basket.clearBasket();
        assertEquals(0, basket.checkContents());
    }

    @Test
    public void testGetPriceOfTwoTwix() {
        basket.addOneItemToBasket(twix);
        basket.addOneItemToBasket(twix);
        assertEquals(3.0, basket.checkTotal(), 0.01);
    }
//
//    @Test
//    public void testGetPriceOfTwixAndCrunchie() {
//        basket.addOneItemToBasket(twix);
//        basket.addOneItemToBasket(crunchie);
//        assertEquals(2.5, basket.checkTotal(), 0.01);
//    }
//
//    @Test
//    public void testGetPriceOfTwixCrunchieAndMilk() {
//        basket.addOneItemToBasket(twix);
//        basket.addOneItemToBasket(crunchie);
//        basket.addOneItemToBasket(milk);
//        assertEquals(5.0, basket.checkTotal(), 0.01);
//    }
}
