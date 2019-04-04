package com.cptneemoo;

import com.cptneemoo.circle.Circle;
import com.cptneemoo.math.DigitSumExecutor;
import com.cptneemoo.math.MaxPalindromeFinder;
import com.cptneemoo.square.Square;
import com.cptneemoo.triangle.Triangle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        //Creation of different shapes
        Circle circle = new Circle(5);
        log.info(String.format("Area of circle is: %g", circle.getArea()));
        Square square = new Square(5);
        log.info(String.format("Area of square is: %g", square.getArea()));
        Triangle triangle = new Triangle(3, 4, 5);
        log.info(String.format("Area of triangle is: %g", triangle.getArea()));
        //Creation of an array of shapes
        ArrayList<AbstractShape> shapes = new ArrayList<>(3);
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        //Calculating minimal and maximum number in the array
        findMinAndMaxInArray(shapes);
        //Calculating sum of digits
        calculateSumOfDigits();
        //Finding max palindrome
        findMaxPalindrome();
    }

    private static void findMaxPalindrome() {
        log.info(String.format("Max palindrome is %d", MaxPalindromeFinder.findMaxPalindrome()));
    }

    private static void calculateSumOfDigits() {
        long number1 = 12345;
        long number2 = 10000000;
        log.info(String.format("The sum of number %d with modulo function is %d",
                number1, DigitSumExecutor.sumDigitsModulo(number1)));
        log.info(String.format("The sum of number %d with char function is %d",
                number1, DigitSumExecutor.sumDigitsChar(number1)));
        log.info(String.format("The sum of number %d with modulo function is %d",
                number2, DigitSumExecutor.sumDigitsModulo(number2)));
        log.info(String.format("The sum of number %d with char function is %d",
                number2, DigitSumExecutor.sumDigitsChar(number2)));
    }

    private static void findMinAndMaxInArray(ArrayList<AbstractShape> shapes) {
        double min = Double.MAX_VALUE;
        Type minType = null;
        double max = Double.MIN_VALUE;
        Type maxType = null;
        for (AbstractShape shape : shapes) {
            double shapeArea = shape.getArea();
            if (shapeArea < min) {
                min = shapeArea;
                minType = shape.getClass();
            }
            if (shapeArea > max) {
                max = shapeArea;
                maxType = shape.getClass();
            }
        }
        log.info(String.format("Minimal value of getArea() is an object with the class %s and value of %g",
                minType, min));
        log.info(String.format("Maximum value of getArea() is an object with the class %s and value of %g",
                maxType, max));
    }
}
