package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 36, b = 4;

        System.out.println("a + b = " + sum(a, b));
        System.out.println("a * b = " + mult(a, b));
        System.out.println("a / b = " + div(a, b));
        System.out.println("a - b = " + subs(a, b));

    }
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int mult (int a, int b) {
        return a * b;
    }
    public static int div (int a, int b) {
        return a / b;
    }
    public static int subs (int a, int b) {
        return a - b;
    }

}

