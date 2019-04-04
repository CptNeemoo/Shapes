package com.cptneemoo.square;

import com.cptneemoo.AbstractShape;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends AbstractShape {

    private double side;

    public double getArea() {
        return side * side;
    }

    public Square(double side) {
        this.side = side;
    }
}
