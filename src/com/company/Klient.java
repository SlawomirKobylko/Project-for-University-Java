package com.company;

import java.lang.management.BufferPoolMXBean;
import java.util.Random;

public class Klient extends Projekty{
    Integer ilosc_projektow;
    public Boolean czy_dziala = true;
    public Boolean kontrakt = true;
    public Random szansa = new Random();
    public Integer kl = szansa.nextInt(3);
    public Klient(Integer poziom_projektu, String nazwa_projektu,
                   Integer termin_oddania, Integer kara, Integer cena, Integer termin_platnosci)
    {
        super(poziom_projektu, nazwa_projektu, termin_oddania, kara, cena, termin_platnosci);
        int s= szansa.nextInt(100);
        if(kl==0) { //wyluzowany
            if (s < 30) { //szansa na opoznienie platnosci
                termin_platnosci += 7;
            } else {
                this.termin_platnosci = termin_platnosci;
            }
            if ((s < 20) && (termin_oddania < (termin_oddania+7))){  //unikniecie kary za opoznienie o tydzien
                kara=0;
            } else {
                this.kara = kara;
            }
            if (!czy_dziala){
                System.out.println("Projekt nie działa, ale jestem klient wyluzowany i możesz ten projekt jeszcze poprawić");
            } else {
                System.out.println("Projekt działa! Dzięki za dobrą robotę!");
            }
        } else if(kl==1) {  //wymagający
            this.termin_platnosci = termin_platnosci;
            this.kara = kara;
            if (!czy_dziala){
                if(s < 50){
                    System.out.println("Projekt nie działa, tracisz kontrakt, bo jestem klientem wymagającym!");
                    this.kontrakt = false;
                    //kosztyprojektu = false;
                } else {
                    System.out.println("Projekt nie działa, ale nie utracisz kontraktu. Mam dziś lepszy dzień");
                }
            } else{
                System.out.println("Projekt działa-jest OK");
            }
        } else { //skrwl
            if (s<30){
                termin_platnosci += 7;
            } else{
                this.termin_platnosci = termin_platnosci;
                System.out.println("Niech Ci będzie, zapłacę Ci na czas...");
            }
            if (s<5){
                termin_platnosci += 31;
                System.out.println("Zapłacę Ci za miesiąc.");
            } else{
                System.out.println("Człowieku, spokojnie, nie spóźnię się o miesiąc...");
                this.termin_platnosci = termin_platnosci;
            }
            this.kara=kara;
            if(!czy_dziala){
                this.kontrakt = false;
                System.out.println("Będziesz słono płacił! Zrywam kontrakt!");
            } else{
                System.out.println("Nie mam się o co przyczepić, kontakt trwa nadal.");
            }
            if (s<1){
                System.out.println("Nie zapłacę Ci, chcesz to idź do sądu! Mam syna adwokata!");
            } else {
                System.out.println("Przecież Cię nie oszukam, zapłacę Ci kasę.");
            }
        }
    }
}
