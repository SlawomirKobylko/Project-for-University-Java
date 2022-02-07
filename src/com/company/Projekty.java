package com.company;

import java.util.Date;

public class Projekty {
    public Integer poziom_projektu;
    String nazwa_projektu;
    String klient;
    String  termin_oddania;
    Integer kara;
    Integer cena;
    String termin_platnosci;
    Technologie t;

    public Projekty
            (Integer poziom_projektu, String nazwa_projektu, String klient,
             String termin_oddania, Integer kara, Integer cena, String termin_platnosci, Technologie t){
        this.poziom_projektu = poziom_projektu; //1-łatwy, 2-średni, 3-złożony
        this.nazwa_projektu = nazwa_projektu;
        this.klient = klient;
        this.termin_oddania = termin_oddania;
        this.kara = kara;
        this.cena = cena;
        this.termin_platnosci = termin_platnosci;
        this.t = t;
    }

}