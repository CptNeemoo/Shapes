package com.cptneemoo.square;

import com.cptneemoo.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public double getArea() {
        return side * side;
    }

    public Square(double side){
        this.side = side;
    }
}
