package com.company;

public class Technologie {

    Integer dni_robocze;

    Technologie(Integer l){
            String s;
            int i;

        switch (l){
            case 0: s="front-end";      dni_robocze = 35; break;
            case 1: s="backend";        dni_robocze = 27; break;
            case 2: s="baza danych";    dni_robocze = 25; break;
            case 3: s="mobile";         dni_robocze = 28; break;
            case 4: s="wordpress";      dni_robocze = 18; break;
            case 5: s="pretashop";      dni_robocze = 15; break;
            default:
                throw new IllegalStateException("Unexpected value: " + l);
        }

        System.out.println("Technologia " + s);


    }
}
