package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //System.out.println();
        Projekty proj = new Projekty
                (3, "ZUS", "comarch",
                        "23.11.2022", 10000, 250000,"12.12.2022");

        Random ran = new Random();
        int x = ran.nextInt(3)*1;

        System.out.println(x);
    }
}
