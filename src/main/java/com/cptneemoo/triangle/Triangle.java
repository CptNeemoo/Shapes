package com.cptneemoo.triangle;

import com.cptneemoo.AbstractShape;

public class Triangle extends AbstractShape {

    private double sideA,sideB,sideC;

    public double getArea() {
        double result;
        double s = (sideA + sideB + sideC)/2;
        s = s * (s - sideA) * (s - sideB) * (s - sideC);
        result =  Math.sqrt(s);
        return result;
    }

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
