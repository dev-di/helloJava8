package com.mycompany.hellojava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author Supergirl
 */
public class MyMath {
    
    public Integer getAverage(List<Integer> intArray) {
        OptionalDouble avg = intArray.stream().mapToInt(i -> i.intValue()).average();
        if (avg != null)
            return (int)Math.round(avg.getAsDouble());
        else
            return null;
    }

    public Integer getMin(List<Integer> intArray) {
        Integer min = intArray.stream().min(Integer::compare).get();
        return min;
    }
    
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        List<Integer> list = Arrays.asList(2,1,3);
        System.out.println("list = " +list);
        System.out.println("min = " +myMath.getMin(list));
    }
    
}
