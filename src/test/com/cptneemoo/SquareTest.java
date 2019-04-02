package com.cptneemoo;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        final double expected = 25;
        Square circle = new Square(5);
        final double actual = circle.getArea();
        Assert.assertEquals(expected,actual);
    }
}