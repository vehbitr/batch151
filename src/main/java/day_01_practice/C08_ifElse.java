package day_01_practice;

import java.util.Scanner;

public class C08_ifElse {

    public static void main(String[] args) {



    /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Hizmet yilinizi giriniz");
        int hizmetYili = scan.nextInt();

        System.out.println("Maasinizi giriniz");
        int maas = scan.nextInt();

        if (hizmetYili>=5 ){
            System.out.println( "Zamli Maas : "+ maas + (maas*10/100));
        }else {
            System.out.println("Zam Alabilmek İcin "+(5-hizmetYili) + "Yil Daha Calismalisin");
        }




    }

}
