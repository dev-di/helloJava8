/*
 * This is an example of using lambda expressions in Java
 */
package com.mycompany.hellojava8;

import java.util.Arrays;

/**
 * @author Diana
 */
public class StringSorter {
    
    public static String[] sortByLength(String[] array) {
        Arrays.sort(array, (s1,s2) -> s1.length() - s2.length());
        return array;
    }

    static String[] sortByReverseLength(String[] array) {
        Arrays.sort(array, (s1,s2) -> s2.length() - s1.length());
        return array;
    }

    static String[] sortAlphabetically(String[] array) {
        Arrays.sort(array);
        return array;
    }
    
}
