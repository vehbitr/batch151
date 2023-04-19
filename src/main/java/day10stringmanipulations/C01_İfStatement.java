package day10stringmanipulations;

import java.util.Scanner;

public class C01_İfStatement {
    public static void main(String[] args) {

        char ch = 'A';

        if (ch>='A' && ch<= 'Z'){
            System.out.println("Buyuk Harf");
        }

        // Ex : Verilen sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu yaziniz

        byte sayi = 24;
        // kodun dinamik yazilmasi icin variable in adi yazilir.
        // Direk deger yazilirsa hurd coding yani tek datalik kod olur
        if (sayi % 2 == 0){
            System.out.println("Sayi Cİft Sayidir");
        }

        int sayi2 = 444;
        if (sayi2 < 300 || sayi2 > 1200){
            System.out.println("Harika Sayi");
        }

        // Ex : Kullanıcıdan alınna datanın tek mi cift mi oldugunu yazdıran kodu yazınız

        // 1. yol ==> Bagimsiz
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen Bir Sayi Giriniz");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Cift Sayi");
        }
        if (num % 2 != 0 ){
            System.out.println("Tek Sayi");
        }


        //2. Yol İf Else
        if (num%2 == 0){
            System.out.println("Cift Sayi");
        }else {
            System.out.println("Tek Sayi");
        }

        // Ex : Verilen bir sayinin negatif mi ,
        // pozitif mi , notr mu oldugunu soyleyen kodu yaziniz

        int numara = 4;

        if (numara < 0){
            System.out.println("3'lu kontrol Negatif Sayi");
        }else if (numara == 0) {
            System.out.println("3'lu kontrol Notr Sayi");
        }else {
            System.out.println("3'lu kontrol Pozitif Sayi");
        }








    }
}
