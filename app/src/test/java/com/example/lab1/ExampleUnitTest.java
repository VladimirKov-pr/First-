package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMaxForOneDigit(){assertEquals(1,MinMaxClass.max(1));}
    @Test
    public void testMaxForTwoDigits(){assertEquals(3,MinMaxClass.max(2,3));}
    @Test
    public void testMaxForManyDigits(){assertEquals(7,MinMaxClass.max(4,7,5,6,3));}
    @Test
    public void testMaxForAllNegativeDigits(){assertEquals(-7,MinMaxClass.max(-7,-8,-9));}
    @Test
    public void testMaxForOneNegativeDigits(){assertEquals(5,MinMaxClass.max(-3,2,5));}


    @Test
    public void testMinForOneDigit(){assertEquals(1,MinMaxClass.min(1));}
    @Test
    public void testMinForTwoDigits(){assertEquals(2,MinMaxClass.min(2,3));}
    @Test
    public void testMinForManyDigits(){assertEquals(2,MinMaxClass.min(4,5,6,2,12));}
    @Test
    public void testMinForAllNegativeDigits(){assertEquals(-9,MinMaxClass.min(-7,-8,-9));}
    @Test
    public void testMinForOneNegativeDigits(){assertEquals(-3,MinMaxClass.min(-3,2,5));}

}