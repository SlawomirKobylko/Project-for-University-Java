package com.company;

import java.util.Arrays;

public class Projekty{
    public Integer poziom_projektu;
    String nazwa_projektu;
    Klient klient;
    public Integer termin_oddania;
    Integer kara;
    Integer cena;
    public Integer termin_platnosci;
    public Technologie [] t;

    public Projekty
            (Integer poziom_projektu, String nazwa_projektu,
             Integer termin_oddania, Integer kara, Integer cena, Integer termin_platnosci) {
        this.poziom_projektu = poziom_projektu; //1-łatwy, 2-średni, 3-złożony
        this.nazwa_projektu = nazwa_projektu;
        this.termin_oddania = termin_oddania;
        this.kara = kara;
        this.cena = cena;
        this.termin_platnosci = termin_platnosci;
        //this.t = new Technologie[ilosc];

        /*
        if (poziom_projektu==0)
        {
            System.out.println("Projekt o nazwie "+ nazwa_projektu + " w technologii "+ t);
            //this.t = new Technologie[poziom_projektu];
        }
        else if(poziom_projektu < 3 && poziom_projektu > 0){
            this.t = new Technologie[poziom_projektu];
        }
        else{
            this.t = new Technologie[poziom_projektu];
        }*/
    }



}