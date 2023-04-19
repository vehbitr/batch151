package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //1.adim Scanner class'tan object olustur
        Scanner input = new Scanner(System.in);

        //2.adim: kullaniciya ne istedigimize dair mesaj veriniz
        System.out.println("İlk isminizi giriniz...");
        String firstName =  input.next();

        System.out.println("Soy isminizi giriniz");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);


    }
}
