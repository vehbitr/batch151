package day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {
    public static void main(String[] args) {


        /*
        Javada char data type'ni matematiksel işlemlerde kullanirsaniz,Ascii table daki sayisal degerleri alir.

        Numeric Data Type'lari byte-short-int-long-float-double
        char karakterin hem sayisal deger barindirir + hem de resim karakteri barindirir
        boolean ==> numeric olmayan data type'dir
         */

        //'A' Karakterinin Ascii degerini hesaplatan kodu yaziniz

        int asciiA= 'A';
        System.out.println(asciiA);

        int asciia='a';
        System.out.println("asciia = " + asciia);

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);

        int asciSembol = '*';
        System.out.println("asciSembol = " + asciSembol);

        char ch = 'Z';
        char sembol = '*';
        char space2 = ' ';
        char rakam = '2';

        int deger = 20;
        char smbl ='$';

        System.out.println(deger+smbl);// $ Ascii degerindeki 36 + 20 = 56

        int deger2 = 0;
        char sembl2= '+';
        System.out.println("deger2+sembl = "+ (deger2 + sembl2));
        /*  Concatination ==> (Concatination girilen verileri resim gibi yanyana yazdırmaya denir)
            olmamasi icin, matematiksel olarak toplaya bilmek icin yapmak istediğimiz işlemi () icine almamiz lazim
            Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar.
            İki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir.
            Buna "Concatination" denir. */

        String name = "123";
        int number = 998;
        System.out.println(number + number); // 12345 Concatination uc uca ekleme yan yana
        String str1 = " Java";
        char ch3 = 'G';
        int sayi1 = 5;
        System.out.println(str1+ch3+sayi1); //JavaG5
        System.out.println(str1+(ch3+sayi1)); // Java76

        System.out.println(ch3+sayi1+str1); //76Java

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);//1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1 + rakam2 + rakam3 + rakam4));// ==> Javada char data type'ni matematiksel işlemlerde kullanirsaniz,Ascii table daki sayisal degerleri alir.

        byte b = 5;
        char ch2 = 'h';

        int asciih = 'h';
        System.out.println("asciih = " + asciih);

        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);

        System.out.println("b > ch2 =" + (b>ch2));//false

        long l = 542168784578L;
        System.out.println("ch2 > l : " + (ch2 > l ));

        float f = 2.45648f ;
        double d = 2.19648;
        System.out.println("f>d = " + (f>d));

        System.out.println("b<f ="  + (b<f));


    }//main

}//class
