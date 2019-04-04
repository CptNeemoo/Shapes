package com.cptneemoo.triangle;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class TriangleTest {

    @Test
    void getArea() {
        final double expected = 6;
        Triangle triangle = new Triangle(3, 4, 5);
        final double actual = triangle.getArea();
        Assert.assertEquals(expected, actual);
    }
}