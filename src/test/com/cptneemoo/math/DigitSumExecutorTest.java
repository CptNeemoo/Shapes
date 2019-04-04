package com.cptneemoo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumExecutorTest {

    @Test
    void digitsSumModulo() {
        assertEquals(15,DigitSumExecutor.DigitsSumModulo(12345));
        assertEquals(6,DigitSumExecutor.DigitsSumModulo(123));
    }

    @Test
    void digitsSumChar() {
        assertEquals(15,DigitSumExecutor.DigitsSumModulo(12345));
        assertEquals(6,DigitSumExecutor.DigitsSumModulo(123));
    }
}