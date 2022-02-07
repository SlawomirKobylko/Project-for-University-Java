package com.company;

import java.util.Arrays;

public class Technologie {
    String tech;
    Integer dni_robocze;

    Technologie(String tech){
        switch (tech){
            case "front-end":   dni_robocze = 10; break;
            case "backend" :    dni_robocze = 9; break;
            case "baza danych": dni_robocze = 5; break;
            case "mobile":      dni_robocze = 8; break;
            case "wordpress":   dni_robocze = 2; break;
            case "pretashop":   dni_robocze = 3; break;
    }

    /*String []technologie = "front-end", "backend", "bazy danych", "mobile", "wordpress", "prestashop";
    Technologie(String []technologie, Integer dni_robocze){
    */

    }
}
