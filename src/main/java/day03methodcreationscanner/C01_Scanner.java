package day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*
            Kullanicidan data almak icin Scanner Classi kullanilir. Ve bir input/scan/scanner objesi olusturulur.
            Bu objeyi new objeyi "new" keyword'u ile oluşturulur.
        */

        //1.adim: obje olusturma
        Scanner input = new Scanner(System.in);

        //2.adim: Kullaniciya ne yapacagini soyliyoruz
        System.out.println("Lutfen maasinizi giriniz...");

        //3.adim: Kullanicidan alinann datalar yapisina ve buyuklugune gore bir variable'a yerlestirilir
        long maas = input.nextLong();

        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        System.out.println("Lutfen cinsiyetinizi kadin ise K Erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);

        System.out.println("Lutfen adinizi giriniz");

        input.nextLine();//dummy atildi ==> (bir java bug'ı) Satir atlamasi yapmamasi icin
        String name = input.nextLine();//nextLine normalde satır atlatan bir methoddur satır atlamasını engellemek icin dummy atilir

        System.out.println("name = " + name);

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip ssevmediginizi giriniz");
        boolean seviyorMu = input.nextBoolean();

        System.out.println("cinsiyet :" + cinsiyet +"\nname:" +name+"\nmemleket : "
                +memleket+"\nyas : "+yas+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu);


    }
}
