package day_01_practice;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen İsminizi ve Soyisminizi giriniz");
        String isimSoyisim = scan.nextLine().toUpperCase();

        char isimİlkKarakter = isimSoyisim.charAt(0);

        char soyİsimİlkKarakter = isimSoyisim.charAt(isimSoyisim.indexOf(" ")+ 1);

        System.out.println("" + isimİlkKarakter + soyİsimİlkKarakter);




    }

}
