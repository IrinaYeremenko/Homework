package com.company;

/**
 * Created by irka on 23.03.2017.
 */
public class Circle extends GeometricFigures {
    public double x1, x2, y1, y2, r1, r2;
    public double sqr1, sqr2;

    public void sqrCircle() {
        sqr1 = Math.PI * Math.pow(r1, 2);
        sqr2 = Math.PI * Math.pow(r2, 2);
    }

    public Circle() {
        x1 = 0;
        y1 = 0;
        r1 = 12;
        x2 = 3;
        y2 = 5;
        r2 = 11;
    }

    public boolean equal() {
        return sqr1 == sqr2 ? true : false;
    }

    public void printSquare2() {
        System.out.println("Площадь окружностей равна: " + equal());
    }
}
