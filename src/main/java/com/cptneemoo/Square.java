package com.cptneemoo;

import java.util.logging.Logger;

public class Square extends AbstractShape {

    private static Logger log = Logger.getLogger(Square.class.getName());

    private double a;

    public double getArea() {
        double result = a * a;
        log.info(Double.toString(result));
        return result;
    }

    public Square(double a){
        this.a = a;
    }
}
