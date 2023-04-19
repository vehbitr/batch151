package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu alini
        //i)Alanini hesaplayiniz
        //ii)Cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        double alan = shortSide * longSide;

        System.out.println( "Alan = " + alan);//Tavsiye edilen
        System.out.println( "Cevre = " + (2 * longSide + 2 * shortSide));



    }
}
