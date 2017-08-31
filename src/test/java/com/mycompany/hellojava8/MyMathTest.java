package com.mycompany.hellojava8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class MyMathTest {

    @Test
    public void testGetMin() {
        System.out.println("getMin");
        List<Integer> intArray = Arrays.asList(1,2,3);
        MyMath instance = new MyMath();
        Integer expResult = new Integer(1);
        Integer result = instance.getMin(intArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMin2() {
        System.out.println("getMin");
        List<Integer> intArray = Arrays.asList(3,2,1);
        MyMath instance = new MyMath();
        Integer expResult = new Integer(1);
        Integer result = instance.getMin(intArray);
        assertEquals(expResult, result);
    }



    @Ignore
    @Test
    public void testEmptyAverage() {
        System.out.println("get empty Average");
        List<Integer> intArray = Arrays.asList();
        MyMath instance = new MyMath();
        Integer expResult = new Integer(2);
        Integer result = instance.getAverage(intArray);
        assertEquals(expResult, result);
    }
    
}
