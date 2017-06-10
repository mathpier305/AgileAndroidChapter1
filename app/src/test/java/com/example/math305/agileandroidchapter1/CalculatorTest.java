package com.example.math305.agileandroidchapter1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by math305 on 6/7/2017.
 */

public class CalculatorTest {
    private static Calculator mCalculator;

    @BeforeClass
    public static void setUp(){
        mCalculator = new Calculator();
    }


    @Test
    public void calculator_CorrectAdd_ReturnsTrue() {
       // double resultAdd = mCalculator.add(3, 4);
        assertEquals(7, mCalculator.add(3, 4), 0);
        assertEquals(7, mCalculator.add(3, 4),0);
        assertEquals(7, mCalculator.add(4, 3),0);
        assertEquals(10, mCalculator.add(8, 2),0);
        assertEquals(3, mCalculator.add(-1, 4),0);
        assertEquals(3260, mCalculator.add(3256, 4),0);
    }
    @Test
    public void calculator_CorrectSub_ReturnsTrue(){
        assertEquals(1, mCalculator.sub(4,3), 0);
    }
    @Test
    public void calculator_CorrectMul_ReturnsTrue(){
        assertEquals(12, mCalculator.mul(3,4), 0);
    }
    @Test
    public  void calculator_CorrectDivv_ReturnsTrue(){
        assertEquals(3, mCalculator.div(12, 4),0);
    }
    @AfterClass
    public static void tearDown(){
        mCalculator = null;
    }
}
