package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(cigarParty(50, false));
        System.out.println(dateFashion(5, 10));
        System.out.println(squirrelPlay(30, false));
        System.out.println(caughtSpeeding(65, true));
        System.out.println(sortaSum(9, 4));
        System.out.println(love6(5, 1));
        System.out.println(in1To10(11, true));
        System.out.println(answerCell(false, false, true));
        System.out.println(noTeenSum(6, 17, 15));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false) {
            return cigars >= 40 && cigars <= 60 ? true : false;
        }
        return isWeekend == true && cigars >= 40 ? true : false;
    }
    
    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == false) {
            return temp >= 20 && temp <= 30 ? true : false;
        }
        return isSummer == true && temp >= 20 && temp <= 50 ? true : false;
    }
    
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday == false) {
            if (speed <= 60) {
                return 0;
            } else if (speed >= 61 && speed <= 81) {
                return 1;
            } else {
            }
            return 2;
        }
        return isBirthday == true && speed <= 65 ? 0 : speed >= 66 && speed <= 86 ? 1 : 2;
    }
    
    public static int sortaSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 19 ? 20 : (a + b);
    }

    public static boolean love6(int a, int b) {
        return (a + b == 6) || (a == 6 || b == 6) || (a - b == 6 || b - a == 6) ? true : false;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == false) {
            return n >= 1 && n <= 10 ? true : false;
        }
        return outsideMode == true && n <= 1 || n >= 10 ? true : false;
    }
    
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return isAsleep == true || (isMorning == true && isMom == false) ? false : true;
    }

    public static int noTeenSum(int a, int b, int c) {
        if ((a >= 13 && a <= 14) || (a >= 17 && a <= 19)) {
            a = 0;
        }
        if ((b >= 13 && b <= 14) || (b >= 17 && b <= 19)) {
            b = 0;
        }
        if ((c >= 13 && c <= 14) || (c >= 17 && c <= 19)) {
            c = 0;
        }
        return a + b + c;
    }
}
