package com.cptneemoo.math;

public class DigitSumExecutor {
    //function to count the sum of digits in the number with modulo operation
    public static int DigitsSumModulo(long number){
        int sum = 0;
        long tmpNumber = number;
        while (tmpNumber != 0){
            sum += tmpNumber % 10;
            tmpNumber /= 10;
        }
        return sum;
    }

    public static int DigitsSumChar(long number){
        return Long.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
