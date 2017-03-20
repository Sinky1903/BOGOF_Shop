package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2017.
 */

public class TestItem {

    Crunchie crunchie;
    Twix twix;

    @Before
    public void before() {
        crunchie = new Crunchie("crunchie");
        twix = new Twix("twix");
    }

    @Test
    public void testGetNameOfTwix() {
        assertEquals("twix", twix.getName());
    }

    @Test
    public void testGetNameOfCrunchie() {
        assertEquals("crunchie", crunchie.getName());
    }

    @Test
    public void testGetPriceOfTwix() {
        assertEquals(1.5, twix.getPrice(), 0.01);
        }

    @Test
    public void testGetPriceOfCrunchie() {
        assertEquals(1.0, crunchie.getPrice(), 0.01);
        }


}
