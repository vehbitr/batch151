package day_01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {

    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgen'nin a kenarini giriniz");
        int a = scan.nextInt();

        System.out.println("Dikdortgen'nin b kenarini giriniz");
        int b = scan.nextInt();

        System.out.println("Dikdortgen'in cevresi : " + ((a*2) + (b*2)));








    }

}
