package day_01_practice;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        String ad = scan.nextLine();

        System.out.println("Lutfen soyadinizi girinzi");
        String soyad = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lutfen boyunuzu girinzi");
        double boy = scan.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Adi:"+ ad +"\n" + "Soyadi:" + soyad+ "\n" + "Yas:" + yas +"\n" + "Boy:" + boy +"\n" + "Kilo:" + kilo);






    }

}
