package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer day = 0;
        Integer ilosc_technilogii;

        Random ran = new Random();
        int x = ran.nextInt(3)*1;

        Technologie t = new Technologie();
        Projekty prosty1 = new Projekty
                (1, "Sklep Internetowy", "Stolarnia",
                        day+100, 15000, 25000, day + 300 );

        Projekty prosty2 = new Projekty(x, "Strona WWW dla Piosenkarki", "Małgorzata",
                day+50, 3000, 8000, day + 75);

        Projekty prosty3 = new Projekty(1, "Baza danych dla WSB", "WSB Gdańsk",
                day + 140, 130000, 200000, day + 240);

        Projekty prosty4 = new Projekty(1, "Kalkulator", "Microsoft", day + 120,
                60000, 100000, day + 160);

        Projekty sredni1 = new Projekty(2, "Gra dla FB", "Meta", day + 200,
                20000, 20000, day+ 210);

        Projekty sredni2 = new Projekty(2, "Reaktywacja NK", "NK", day + 40,
                140000, 150000, day + 80);

        Projekty sredni3 = new Projekty(2, "Baza dancyh dla Hurtowni", "Inter Car",
                day+ 150, 400000, 800000, day + 300);

        //Projekty zlozony1 = new Projekty(3, )

        //System.out.println(prosty.toString());


        System.out.println("Witaj! Zaczynamy grę!");
        if (x==0) {
            System.out.println("Wylosowałeś prosty projekt.");
        }
        else if (x==1){
            System.out.println("Wylosowałeś średni projekt.");
        }
        else{
            System.out.println("Wylosowałeś złożony projekt. Do złożonych projektów potrzeba pracowników");
            System.out.println("Czy posiadasz pracowników?");
            /*if (pracownicy==0)
            System.out.println("Nie posiadasz pracowników, musisz zacząć grę od nowa");
            */
        }

    }
}
