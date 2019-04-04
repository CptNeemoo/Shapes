package com.cptneemoo.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getArea() {
        final double expected = 25;
        Square square = new Square(5);
        final double actual = square.getArea();
        assertEquals(expected, actual);
    }
}