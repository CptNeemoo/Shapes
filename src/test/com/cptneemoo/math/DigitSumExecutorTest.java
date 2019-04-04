package com.cptneemoo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSumExecutorTest {

    @Test
    void digitsSumModulo() {
        assertEquals(15, DigitSumExecutor.sumDigitsModulo(12345));
        assertEquals(6, DigitSumExecutor.sumDigitsModulo(123));
    }

    @Test
    void digitsSumChar() {
        assertEquals(15, DigitSumExecutor.sumDigitsModulo(12345));
        assertEquals(6, DigitSumExecutor.sumDigitsModulo(123));
    }
}