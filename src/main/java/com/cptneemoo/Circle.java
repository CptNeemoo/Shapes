package com.cptneemoo;

import java.util.logging.Logger;

public class Circle extends AbstractShape {

    private static Logger log = Logger.getLogger(Circle.class.getName());

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea() {
        double result = Math.PI * radius * radius;
        log.info(Double.toString(result));
        return result;

    }

}
