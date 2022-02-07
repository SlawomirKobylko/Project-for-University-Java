package com.company;

import java.util.Arrays;
import java.util.Random;

public class Technologie {
    Random techran = new Random();
    Integer dni_robocze;
    //Integer l = techran.nextInt(6)*1;

    Technologie(){
            Integer l = techran.nextInt(6)*1;
            String s;
        switch (l){
            case 0: s="front-end";   dni_robocze = 10; break;
            case 1: s="backend";     dni_robocze = 9; break;
            case 2: s="baza danych"; dni_robocze = 5; break;
            case 3: s="mobile";      dni_robocze = 8; break;
            case 4: s="wordpress";   dni_robocze = 2; break;
            case 5: s="pretashop";  dni_robocze = 3; break;
            default:
                throw new IllegalStateException("Unexpected value: " + l);
        }
        System.out.println("technologia "+ s);

    }
}
