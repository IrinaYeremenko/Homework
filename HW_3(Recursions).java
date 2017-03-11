package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(powerN(3, 3));
        System.out.println(bunnyEars2(3));
        System.out.println(sumDigits(126));
        System.out.println(makeChocolate(4, 1, 9));
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
    
    public static int makeChocolate(int small, int big, int goal) {
        big *= 5;
        if (big + small < goal || small < goal % 5)
            return -1;
        small = goal - big;
        return small < 0 ? (big + small) % 5 : small;
    }
}
