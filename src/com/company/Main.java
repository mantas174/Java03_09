package com.company;

import java.util.Scanner;

public class Main {
    public static final int OPERACIJOS_KARTOJIMAS = 5;
    public static final int OPERACIJA_SUMA = 1;
    public static final int OPERACIJA_SKIRTUMAS = 2;
    public static final int OPERACIJA_SANDAUGA = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sk1, sk2;
        int operacija;
        int rezultatas = 1;
        int arKartoti;

        do {
            System.out.print("Iveskite du skaicius: ");
            sk1 = in.nextInt();
            sk2 = in.nextInt();

            System.out.print("Iveskite operacija 1-suma, 2-Skirtumas, 3-sanduga: ");
            operacija = in.nextInt();
            switch(operacija){
                case OPERACIJA_SUMA:
                rezultatas = sk1 + sk2;
                break;
                case OPERACIJA_SKIRTUMAS:
                    rezultatas = sk1 - sk2;
                    break;
                case OPERACIJA_SANDAUGA:
                    rezultatas = sk1 * sk2;
                    break;
            }
            System.out.println("Rezultatas: " +rezultatas);
            System.out.println("Ar noretumete kartoti (taip-5)");
            arKartoti = in.nextInt();
        }while(arKartoti == OPERACIJOS_KARTOJIMAS);
    }
}
