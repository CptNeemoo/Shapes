package com.cptneemoo;

import java.util.logging.Logger;

public class Triangle extends AbstractShape {

    private static Logger log = Logger.getLogger(Triangle.class.getName());

    private double a,b,c;

    public double getArea() {
        double result;
        double s = (a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        result =  Math.sqrt(s);
        log.info(Double.toString(result));
        return result;
    }

    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
