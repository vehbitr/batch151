package day_02_practicent02;

import java.util.Scanner;

public class C03_IfElse {
    /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise,
        ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola
        "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime1=input.next();
        System.out.println("lutfen bir kelime daha giriniz");
        String kelime2=input.next();

        if (kelime1.length()%2==0){
            String ilkYarisi= kelime1.substring(0,kelime1.length()/2);
            String ikinciYarisi= kelime1.substring(kelime1.length()/2);
            System.out.println(ilkYarisi+kelime2+ikinciYarisi);
        }else {
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }



    }
}
