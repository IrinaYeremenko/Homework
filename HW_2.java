package com.company;

import java.util.Random;

public class HW_2 {

    public static void main(String[] args) {
        int[][] Arr = new int[3][3];
        Random R = new Random();
        for (int i = 0; i < Arr.length; i++)
            for (int j = 0; j < Arr[i].length; j++)
                Arr[i][j] = R.nextInt(10);
        System.out.println("Выводим матрицу");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы выше побочной диагонали с диагональю");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < (Arr.length - i); j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы выше побочной диагонали без диагонали");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < (Arr.length - i - 1); j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы ниже побочной диагонали с диагональю");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 3 - i - 1; j < Arr.length; j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы ниже побочной диагонали без диагонали");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 3 - i; j < (Arr.length); j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы выше главной диагонали с диагональю");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i; j < Arr.length; j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы выше главной диагонали без диагонали");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы ниже главной диагонали с диагональю");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим элементы ниже главной диагонали без диагонали");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(Arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Выводим равнобедренный треугольник");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
        //Вызов функции вывода треугольника Паскаля
        System.out.println("Выводим треугольник Паскаля");
        pascal(10);
    }

    public static int[][] pascal(int n) {
        int d = n * 2;
        int[][] pas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    pas[i][j] = 1;
                } else {
                    pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
                }
                String co = " %" + d + "d";
                if (j == 0) {
                    System.out.printf(co, pas[i][j]);
                } else {
                    System.out.printf("%4d", pas[i][j]);
                }
            }
            System.out.println();
            d -= 2;
        }
        return pas;
    }
}
