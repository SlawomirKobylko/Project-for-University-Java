package com.company;

import java.awt.font.TextHitInfo;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int day = 0;

        Random ran = new Random();
        int x = ran.nextInt(12);

        //Technologie t = new Technologie();
        Projekty prosty1 = new Projekty("prosty","Sklep Internetowy",
                        day+20, 15000, 25000, day + 60);

        Projekty prosty2 = new Projekty("prosty", "Strona WWW dla Piosenkarki",
                day+50, 3000, 8000, day + 75);

        Projekty prosty3 = new Projekty("prosty", "Baza danych dla WSB",
                day + 30, 130000, 200000, day + 40);

        Projekty prosty4 = new Projekty("prosty", "Kalkulator", day + 40,
                60000, 100000, day + 45);

        Projekty sredni1 = new Projekty("średni", "Gra dla FB", day + 200,
                20000, 20000, day+ 210);

        Projekty sredni2 = new Projekty("średni", "Reaktywacja NK", day + 40,
                140000, 150000, day + 80);

        Projekty sredni3 = new Projekty("średni", "Baza danych dla Hurtowni",
                day+ 150, 300000, 400000, day + 300);

        Projekty sredni4 = new Projekty("średni", "m_OBYWATEL", day + 60,
                200000, 300000, day+80);

        Projekty zlozony1 = new Projekty("złożony","e-PUAP",  day + 300,
                800000, 1200000, day + 600);

        Projekty zlozony2 = new Projekty("złożony", "E-TOLL", day + 150, 600000,
                900000, day + 350);

        Projekty zlozony3 = new Projekty("złożony", "ZUS 2022", day + 250, 500000,
                700000, day + 500);

        Projekty zlozony4 = new Projekty("złożony", "Hurtownia", day + 350, 450000,
                550000, day + 450);

        Pracownicy najlepszy = new Pracownicy("Adam", "najlepszy uczeń", 6000);
        Pracownicy sredni = new Pracownicy("Maciek", "średni uczeń", 4000);
        Pracownicy madrala = new Pracownicy("Marcin", "przemądrzały", 3000);

        prosty1.dodajTechnologie();




        Klient pierwszy = new Klient(zlozony1);

        Klient pierwszy1 = new Klient(zlozony2);

        Klient pierszy2 = new Klient(zlozony3);

        Klient pierwszy3 = new Klient(zlozony4);

        Klient drugi = new Klient(prosty1);

        Klient drugi1 = new Klient(prosty2);

        Klient drugi2 = new Klient(prosty3);

        Klient drugi3 = new Klient(prosty4);

        Klient trzeci = new Klient(sredni1);

        Klient trzeci1 = new Klient(sredni2);

        Klient trzeci2 = new Klient(sredni3);

        Klient trzeci3 = new Klient(sredni3);


        System.out.println("Witaj! Zaczynamy grę!\n Jest "+ x + " dzień");

        switch (x)
        {
            case 0:
                System.out.println("Wylosowano " + prosty1.nazwa_projektu + " projekt i " + pierwszy + " klienta"); break;
            case 1:
                System.out.println("Wylosowano " + prosty2.nazwa_projektu + " projekt i " + trzeci + " klienta"); break;
            case 2:
                System.out.println("Wylosowano " + prosty3.nazwa_projektu + " projekt i " + pierszy2 + " klienta"); break;
            case 3:
                System.out.println("Wylosowano " + prosty4.nazwa_projektu + " projekt i " + pierwszy1 + " klienta"); break;
            case 4:
                System.out.println("Wylosowano " + sredni1.nazwa_projektu + " projekt i " + pierwszy3 + " klienta"); break;
            case 5:
                System.out.println("Wylosowano " + sredni2.nazwa_projektu + " projekt i " + drugi + " klienta"); break;
            case 6:
                System.out.println("Wylosowano " + sredni3.nazwa_projektu + " projekt i " + drugi1 + " klienta"); break;
            case 7:
                System.out.println("Wylosowano " + sredni4.nazwa_projektu + " projekt i " + drugi2 + " klienta"); break;
            case 8:
                System.out.println("Wylosowano " + zlozony1.nazwa_projektu + " projekt i " + drugi3 + " klienta"); break;
            case 9:
                System.out.println("Wylosowano " + zlozony2.nazwa_projektu + " projekt i " + trzeci1 + " klienta"); break;
            case 10:
                System.out.println("Wylosowano " + zlozony3.nazwa_projektu + " projekt i " + trzeci2 + " klienta"); break;
            case 11:
                System.out.println("Wylosowano " + zlozony4.nazwa_projektu + " projekt i " + trzeci3 + " klienta"); break;
        }


    }
}
