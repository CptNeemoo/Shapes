package com.cptneemoo.math;

public class MaxPalindromeFinder {
    public static long findMaxPalindrome(){
        long max = 0;
        for (int i = 9999; i > 0; i--){
            for (int j = i; j > 0; j--){
                long multiplicationResult = i * j;
                if (multiplicationResult > max && MaxPalindromeFinder.isPalindrome(multiplicationResult)) {
                    max = multiplicationResult;
                }
            }
        }
        return max;
    }


    static boolean isPalindrome(long number){
        char[] numberArray = Long.toString(number).toCharArray();
        boolean result = true;
        for (int i = 0; i < numberArray.length / 2; i++){
            result &= numberArray[i] == numberArray[numberArray.length - i - 1];
        }
        return result;
    }
}
