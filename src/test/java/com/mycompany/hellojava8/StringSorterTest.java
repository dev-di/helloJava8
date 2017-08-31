/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellojava8;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Supergirl
 */
public class StringSorterTest {
    
    public StringSorterTest() {
    }

    @Test
    public void testSortByLength() {
        System.out.println("sortByLength");
        String[] input = {"Apelsin","Banan","Bär"};
        String[] expResult = {"Bär","Banan","Apelsin"};
        String[] result = StringSorter.sortByLength(input);
        assertArrayEquals(expResult, result);
    }
    
    @Test(timeout = 200)
    public void testSortByReverseLength() {
        System.out.println("sortByLength");
        String[] input = {"Apelsin","Banan","Bär"};
        String[] expResult = {"Apelsin","Banan","Bär"};
        String[] result = StringSorter.sortByReverseLength(input);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSortAlphabetically() {
        System.out.println("sortByLength");
        String[] input = {"Apelsin","Päron","Banan","Blåbär"};
        String[] expResult = {"Apelsin","Banan","Blåbär","Päron"};
        String[] result = StringSorter.sortAlphabetically(input);
        assertArrayEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testSortByLengthNull() {
        String[] input = null;
        String[] result = StringSorter.sortByLength(input);
    }
    @Test(expected = NullPointerException.class)
    public void testSortByReversedLengthNull() {
        String[] input = null;
        String[] result = StringSorter.sortByReverseLength(input);
    }
    @Test(expected = NullPointerException.class)
    public void testSortAlphabeticallyNull() {
        String[] input = null;
        String[] result = StringSorter.sortAlphabetically(input);
    }
    
}
