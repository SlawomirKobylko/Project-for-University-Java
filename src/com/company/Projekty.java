package com.company;

import java.util.Arrays;

public class Projekty {
    public Integer poziom_projektu;
    String nazwa_projektu;
    String klient;
    Integer termin_oddania;
    Integer kara;
    Integer cena;
    Integer termin_platnosci;
    public Technologie []t;

    public Projekty
            (Integer poziom_projektu, String nazwa_projektu, String klient,
             Integer termin_oddania, Integer kara, Integer cena, Integer termin_platnosci){
        this.poziom_projektu = poziom_projektu; //1-łatwy, 2-średni, 3-złożony
        this.nazwa_projektu = nazwa_projektu;
        this.klient = klient;
        this.termin_oddania = termin_oddania;
        this.kara = kara;
        this.cena = cena;
        this.termin_platnosci = termin_platnosci;
        /*this.t = t;

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

    @Override
    public String toString() {
        return "Projekty{" +
                "poziom_projektu=" + poziom_projektu +
                ", nazwa_projektu='" + nazwa_projektu + '\'' +
                ", klient='" + klient + '\'' +
                ", termin_oddania=" + termin_oddania +
                ", kara=" + kara +
                ", cena=" + cena +
                ", termin_platnosci=" + termin_platnosci +
                ", t=" + Arrays.toString(t) +
                '}';
    }
}