package com.company;

/**
 * Created by irka on 23.03.2017.
 */
public class Polygon extends GeometricFigures {
    public double side;
    public int n;

    public double radius() {
        return side / (2 * Math.sin(Math.PI / n));
    }

    public double perimeter() {
        return side * n;
    }

    public Polygon() {
        side = 6;
        n = 7;
    }

    public void printPolygon() {
        System.out.println("Радиус описанной вокруг многоугольника окружности: " + radius());
        System.out.println("Периметр: " + perimeter());
    }
}
