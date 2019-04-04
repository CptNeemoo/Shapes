package com.cptneemoo.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    @Test
    void getArea() {
        final double expected = Math.PI * Math.PI * Math.PI;
        Circle circle = new Circle(Math.PI);
        final double actual = circle.getArea();
        assertEquals(expected, actual, 0.1);
    }
}
