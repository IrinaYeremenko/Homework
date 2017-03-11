package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(powerN(3, 3));
        System.out.println(bunnyEars2(3));
        System.out.println(sumDigits(126));
    }

    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public static int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }
    
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return bunnies;
        return bunnies % 2 == 1 ? 2 + bunnyEars2(bunnies - 1) : 3 + bunnyEars2(bunnies - 1);
    }
    
     public static int sumDigits(int n) {
        return  n < 10 ? n : n % 10 + sumDigits(n / 10);
    }
}
