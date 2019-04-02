package com.cptneemoo;

import com.cptneemoo.circle.Circle;
import com.cptneemoo.square.Square;
import com.cptneemoo.triangle.Triangle;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        Circle circle = new Circle(5);
        log.info(Double.toString(circle.getArea()));
        Square square = new Square(5);
        log.info(Double.toString(square.getArea()));
        Triangle triangle = new Triangle(3,4,5);
        log.info(Double.toString(triangle.getArea()));
    }
}
