package com.cptneemoo.circle;

import com.cptneemoo.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
