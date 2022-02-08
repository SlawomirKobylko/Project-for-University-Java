package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer day = 0;

        Random ran = new Random();
        int x = ran.nextInt(3);

        Technologie t = new Technologie (1,0);

        //Technologie t = new Technologie();
        Projekty prosty1 = new Projekty(x, "Sklep Internetowy",
                        day+20, 15000, 25000, day + 60);

        Projekty prosty2 = new Projekty(x, "Strona WWW dla Piosenkarki",
                day+50, 3000, 8000, day + 75);

        Projekty prosty3 = new Projekty(x, "Baza danych dla WSB",
                day + 30, 130000, 200000, day + 40);

        Projekty prosty4 = new Projekty(x, "Kalkulator", , day + 40,
                60000, 100000, day + 45);

        Projekty sredni1 = new Projekty(x, "Gra dla FB", , day + 200,
                20000, 20000, day+ 210);

        Projekty sredni2 = new Projekty(x, "Reaktywacja NK", , day + 40,
                140000, 150000, day + 80);

        Projekty sredni3 = new Projekty(x, "Baza danych dla Hurtowni", ,
                day+ 150, 300000, 400000, day + 300);

        Projekty srendni4 = new Projekty(x, "m_OBYWATEL", , day + 60,
                200000, 300000, day+80);

        Projekty zlozony1 = new Projekty(x,"e-PUAP", ,  day + 300,
                800000, 1200000, day + 600);

        Projekty zlozony2 = new Projekty(x, "E-TOLL", , day + 150, 600000,
                900000, day + 350);

        Projekty zlozony3 = new Projekty(x, "ZUS 2022", , day + 250, 500000,
                700000, day + 500);

        Projekty zlozony4 = new Projekty(x, "Hurtownia", , day + 350, 450000,
                550000, day + 450);

        Klient wyluzowany()

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
