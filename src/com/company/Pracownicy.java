package com.company;

import java.util.Random;

public class Pracownicy {
    String nazwa_pracownika;
    String typ;
    Integer zaplata;

    Pracownicy(String nazwa_pracownika, String typ, Integer zaplata){
        this.nazwa_pracownika=nazwa_pracownika;
        this.typ=typ;
        this.zaplata=zaplata;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "nazwa_pracownika='" + nazwa_pracownika + '\'' +
                ", typ='" + typ + '\'' +
                ", zaplata=" + zaplata +
                '}';
    }
}
