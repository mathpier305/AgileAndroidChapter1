package com.example.math305.agileandroidchapter1;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;


/**
 * Created by math305 on 6/7/2017.
 */

public class CalculatorHamcrestTest {
    private static Calculator mCalculator;

    @BeforeClass
    public static void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectHamSub_ReturnsTrue(){
        assertThat("Calculator cannotot add 3 plus 4 ",  mCalculator.sub(4,3), is(1.0));
        assertThat("Greater than failed", mCalculator.sub(3, 4),greaterThan(-2.0) );
        assertThat("Less than failed", mCalculator.sub(3, 4),lessThan(0.0));
    }

    @Test
    public void calculator_CorrectHamAdd_ReturnsTrue(){
        assertThat("Calculator canot add 3 plus 4 ",  mCalculator.add(3,4), is(7));
        assertThat("Greater than failed", mCalculator.add(3, 4),greaterThan(6) );
        assertThat("Less than failed", mCalculator.add(3, 4),lessThan(8));
    }
}
