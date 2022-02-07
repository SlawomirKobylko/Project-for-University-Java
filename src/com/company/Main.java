package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt(3)*1;

        System.out.println("Zaczynamy grę!");
        if (x==0)
            System.out.println("Wylosowałeś prosty projekt.");
        else if (x==1)
            System.out.println("Wylosowałeś średni projekt.");
        else{
            System.out.println("Wylosowałeś złożony projekt. Do złożonych projektów potrzeba pracowników");
            System.out.println("Czy posiadasz pracowników?");
            /*if (pracownicy==0)
            System.out.println("Nie posiadasz pracowników, musisz zacząć grę od nowa");
            */
        }

    }
}
