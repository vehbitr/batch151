package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        // java bunu okumaz. Kendimize yada başkasına not birakabiliriz
        /*
        *java bu satırlarıda okumaz
         */

        //Variable olusturmak
        //data type + variable name + atama operatoru + data + noktali virgul
            int          age              =              13          ;

            /* java cumlesi = Statement
                *java'da "=" assigment operator. Sagdaki egeri alir soldaki kutuya koyar
                * java'da esittir demek "=="
                * Eger variable declaration yapar,assignment yapmazsanir java kendi Default degeelerini yukler
                * Default deger SAYILAR icin SIFIRDIR.
                *
                * Data Type + variable name ==> Variable declaration
                * Assignment operator ( atama operatoru ) + variable degeri == Assignment
                */

        /*

                        ***** Java'da temel iki tip data vardir. *******

        1 Primitive data type :

        char,boolean,byte,short , int , long ,float ,double

         */

        // O

        // Example 1 : Ogrenci ismi variable olusturunuz ve deger olarak Ali Can atayiniz.

        String studentName = "Ali Can" ;
            //Stringler icin "default value" "null" dir
            //null demek 0 demek degildir. çünkü 0 da coding te bir degerdir.
            //null ici bos obje demektir
            //{}

        // char data type:
        // Tek karakterler icin kullanillir. ornegin ==> A, x, 5, ?
        // ornek 2 : char datta type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atatyiniz
        // note char data type'inde degerler tek tirnak icine konmalidir
        char isminİlkHarfi = 'A' ;

        //boolean data type:
        //boolean lar iki farkli deger alabilirler true (dogru) veya false (yanlis)
        //Ornek 3: boolean data tipinde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false ;

        //byte data type:
        //tam sayilar icindir. hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil) kadar tamsayi degerleri icin kullanilabilir
        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte studentAge = 23;

        //short data type:
        //tam sayilar icindir ve hafizada 2 byte yer kaplar
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        short okuldakiOgrenciSayisi = 1300;

        //int data type:
        //tam sayilar icindir. hafizada 4 byte yer kaplar
        //int :-2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5:ulke nüfusu icin bir variable olusturunuz ve deger atamasi yapiniz.
        int countryPopulation =1500000;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir
        //Ornek 6: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        //Note:Bir deger long ise sonuna 'L' (tercih edilir) yada 'l' konulur.
        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna 'L' koymaya gerek yok
        //Long dememize ragmen sonuna eger L koymazsak java onu eger int araliginda ise int olarak kabul eder
        long cellNumberInHumanBody = 787445446841L;
        long weight = 1234565;//int'lerin araliginda ise sonuna 'L' koymaya gerek yok

        //float data type:
        //float virgullu sayilar (Decimal numbers==> ondalikli sayilar) icin kullanilir
        //fiyatlandirmalar icin tercih edilebilir (12.99)
        //Ornek 7: Gomlek ve ayakkabi fiyatlari icin iki tane varibale olusturup toplam fiyati ekrana yazdiriniz.
        //Note: java ondalikli sayilari yani "Decimal Numbers" i otomatik olarak "double" kabul eder
        //      siz data type'ini float yazarsaniz hata verir.
        //      float olmasinda israr ediyorsaniz sonuna "F" yada "f" koymalisiniz
        //      float memory de 4 byte yer kaplar, double 8 byte yer kaplar

        float gomlekFiyati = 12.99F;
        float ayakkabiFiyati = 15.99F;

        System.out.println(gomlekFiyati + ayakkabiFiyati);

        //      System.out.println(); kodu parantez icine yazdiklarimizi ekrana yadirir.
        int a = 12;
        int b = 13;
        System.out.println(a+b);
        // System.out.println(); ekrana yazdirir "pointer " i bir sonraki satira koyar
        // System.out.print(); ekrana yazdirir ve "pointer" i ayni satirda tutar.
        int c = 312;
        int d = 313;

        System.out.print(c);
        System.out.print(d);

        // double data type:
        // double memoryde daha fazla yer kaplar, virgülden sonra daha fazla rakam alır
        // double virgullu sayilar (Decimal numbers==> ondalikli sayilar) icin kullanilir
        //ornek8 : Hucre agırlıgı ve amipin agirligi icin iki tane veriable olusturunuz ve agırlıgın farkınıı ekrana yazdırınız
        double weightCell = 0.00000000000000112;
        double weightAmip = 0.00000000000000023;
        //System.out.println(); yazdirmanin kisa yolu sout yazini enter basın
        System.out.println(weightCell - weightAmip);




    }
}




















