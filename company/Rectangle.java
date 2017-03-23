package com.company;

/**
 * Created by irka on 23.03.2017.
 */
public class Rectangle extends GeometricFigures {
    public double sqr1, sqr2;
    public double a, b, x, y;

    public void sqrRectangles() {
        sqr1 = a * b;
        sqr2 = x * y;
    }

    public Rectangle() {
        a = 3;
        b = 8;
        x = 6;
        y = 4;
    }

    public boolean equal() {
        return sqr1 == sqr2 ? true : false;
    }

    public void printSquare1() {
        System.out.println("Площадь прямоугольников равна: " + equal());
    }
}
