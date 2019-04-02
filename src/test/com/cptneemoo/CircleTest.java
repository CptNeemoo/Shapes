package com.cptneemoo;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CircleTest {
    @Test
    void getArea() {
        final double expected = Math.PI * Math.PI * Math.PI;
        Circle circle = new Circle(Math.PI);
        final double actual = circle.getArea();
        Assert.assertEquals(expected,actual);
    }
}
