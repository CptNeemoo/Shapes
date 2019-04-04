package com.cptneemoo.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void getArea() {
        final double expected = 6;
        Triangle triangle = new Triangle(3, 4, 5);
        final double actual = triangle.getArea();
        assertEquals(expected, actual);
    }
}