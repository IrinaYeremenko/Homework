package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(cigarParty(50, false));
        System.out.println(dateFashion(5, 10));
        System.out.println(squirrelPlay(30, false));
        System.out.println(caughtSpeeding(65, true));
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
}
