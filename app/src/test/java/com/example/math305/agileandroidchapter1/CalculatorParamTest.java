package com.example.math305.agileandroidchapter1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

/**
 * Created by math305 on 6/7/2017.
 */

@RunWith(Parameterized.class)
public class CalculatorParamTest {
    private int mOperandOne;
    private int mOperandTwo;
    private int mExpectedResult;
    private Calculator mCalculator;

    /*arrays of test */
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {3, 4, 7},
                {4, 3, 7},
                {8, 2, 10},
                {-1, 4, 3},
                {3256, 4, 3260}
        });
    }

    /* Constructor */
    public CalculatorParamTest(int mOperandOne, int mOperandTwo, int mExpectedResult){
        this.mOperandOne = mOperandOne;
        this.mOperandTwo = mOperandTwo;
        this.mExpectedResult = mExpectedResult;
    }

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void testAdd_TwoNumbers(){
        double resultAdd = mCalculator.add(mOperandOne, mOperandTwo);
        assertEquals(resultAdd, mExpectedResult, 0);
    }




}
