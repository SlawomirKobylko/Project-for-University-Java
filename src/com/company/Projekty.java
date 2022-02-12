package com.company;

public class Projekty{
    public String poziom_projektu;
    public String poziom_klienta;
    String nazwa_projektu;
    Klient klient;
    public Integer termin_oddania;
    Integer kara;
    Integer cena;
    public Integer termin_platnosci;
    public Technologie technologie;

    public Projekty
            (String poziom_projektu, String nazwa_projektu,
             Integer termin_oddania, Integer kara, Integer cena, Integer termin_platnosci) {
        this.poziom_projektu = poziom_projektu; //1-łatwy, 2-średni, 3-złożony
        this.nazwa_projektu = nazwa_projektu;
        this.termin_oddania = termin_oddania;
        this.kara = kara;
        this.cena = cena;
        this.termin_platnosci = termin_platnosci;
    }

    @Override
    public String toString() {
        return "Projekty{" +
                "poziom_projektu='" + poziom_projektu + '\'' +
                ", poziom_klienta='" + poziom_klienta + '\'' +
                ", nazwa_projektu='" + nazwa_projektu + '\'' +
                ", termin_oddania=" + termin_oddania +
                ", kara=" + kara +
                ", cena=" + cena +
                ", termin_platnosci=" + termin_platnosci +
                ", technologie=" + technologie +
                '}';
    }

    void dodajTechnologie(){
        System.out.println("To jest projekt "+ nazwa_projektu +", który musi być zrobiony w technologii "+ new Technologie(1));
    }

}