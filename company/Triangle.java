package com.company;

/**
 * Created by irka on 23.03.2017.
 */
public class Triangle extends GeometricFigures {
    public double a, b;

    public double hypotenuse() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double height() {
        double c, d;
        double e = hypotenuse();
        d = e / (Math.pow(a, 2) / Math.pow(b, 2) + 1);
        c = e - d;
        return Math.sqrt(c * d);
    }

    public Triangle() {
        a = 3;
        b = 4;
    }

    public void printHeight() {
        System.out.println("Длина высоты опущенной на гипотенузу: " + height());
    }
}
