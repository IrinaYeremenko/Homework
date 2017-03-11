package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(cigarParty(50, false));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false) {
            return cigars >= 40 && cigars <= 60 ? true : false;
        }
        return isWeekend == true && cigars >= 40 ? true : false;
    }
}
