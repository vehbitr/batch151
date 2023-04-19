package day_02_practicent02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Interwiew questions
        //Example: Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz

        /*
             A
            A A
           A A A
    */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir karakter veiriniz...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch + " "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        // Ex: Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin
        // sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz

        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        System.out.println("sayi1" +" + "+"sayi2 "+"= "+ (sayi1+sayi2));
        System.out.println("sayi1"+" - "+"sayi2 "+"= "+(sayi1-sayi2));
        System.out.println("sayi1"+" x "+"sayi2 "+"= "+(sayi1*sayi2));
        System.out.println("sayi1"+" : "+"sayi2 "+"= "+(sayi1/sayi2));

        //Ex  kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2  rakamlari toplamini bulan kodu yaziniz
        //input 12345 ==>1+2+4+5
        //output==>12

        // 1.Yol
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();//12345

        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);

        int ilkIkiToplam = (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkiRkm= num%100;//45
        int sonIkiRkmToplam = (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmToplam = " + sonIkiRkmToplam);
        int toplam=ilkIkiToplam+sonIkiRkmToplam;
        System.out.println("toplam = " + toplam);

        // 2.Yontem
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        int first = number%10;
        int second = number/10%10;
        int third = number%10;
        int firth = number/10%10;

    }

}
