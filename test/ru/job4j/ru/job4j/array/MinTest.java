package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int expect = 0;
        int result = Min.findMin(array);
        assertThat(result, is(expect));
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int expect = 3;
        int result = Min.findMin(array);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMidMin() {
        int[] array = new int[] {10, 2, 5};
        int expect = 2;
        int result = Min.findMin(array);
        assertThat(result, is(expect));
    }
}