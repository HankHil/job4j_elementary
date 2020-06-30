package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenPoints0020Then20Distance() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenPoints002013Then2828Distance3d() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(2, 0, 3);
        double expected = 2.828;
        double out = a.distance3d(b);
        Assert.assertEquals(out, expected, 0.01);
    }
}