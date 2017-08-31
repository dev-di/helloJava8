package com.mycompany.hellojava8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Supergirl
 */
@RunWith(Parameterized.class)
public class MyAverageParameterizedTest {
    
    private List<Integer> input;
    private int expected;
    
    public MyAverageParameterizedTest(List<Integer> input, int expected) {
        this.input = input;
        this.expected = expected;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {Arrays.asList(1,2,3), 2},
            {Arrays.asList(3,2,1), 2},
            {Arrays.asList(2,1,3), 2},
            {Arrays.asList(2,2,1), 2},
        });
    }
            

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        MyMath instance = new MyMath();
        assertThat(instance.getAverage(input), is(expected));
    }
    
    
}
