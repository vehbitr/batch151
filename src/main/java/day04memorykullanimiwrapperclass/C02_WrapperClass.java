package day04memorykullanimiwrapperclass;

public class C02_WrapperClass {

    /*
    Java sonucta bir urundur.
    Oracle firmasinin bir urunudur.
    Developerlar sadece data barindiran primitive data typelarinin non-primitive ler gibi
    method'da barindirmasini istemislerdir.Bunun uzerine Java primitive data type'larina
    method ekleyerek; ozel bir class olusturmustur.
    Bunada wrapper(sarmalamak,durum) class denir.

        Primitive               Non-Primitive
            byte         ==>          Byte
            short        ==>          Short
             int          ==>          Integer  *****
            long         ==>          Long
            float        ==>          Float
             double       ==>          Double
            boolean      ==>          Boolean
            char         ==>          Character  *****

     */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMin + intMax= " + (byteMin + intMax));


        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat; // Buna Autoboxing denir
        // Java bunu otomatik olarak yapar kucuk kutuyu buyuk kutuya yerlestirir.

        //**************** Wrappper Class'lari Primitive Data typelarina nasıl ceviririz. ***********

            Character wrapperChar = 'a';
            char primitivechar = wrapperChar;// Unboxing kucuk kutuyu buyuk kutudan cikarma Java bunu da otomatik yapar

        // Ex Verilen iki String datanin toplamini veren kodu yaziniz.

        String str1 = "12345";
        String str2 = "678";
        System.out.println( str1 + str2);
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        // valueOf() ==> String bir datayi Integer'a donusturur.

        /*
            Javada "+" sembolu iki int icin maetematikteki gibi toplama islemi yapar.
            iki String data arasinda ya da bir String bir int arasinda ise yanyana yazardirir.
            Buna "Concatination" denir
            Java matematik bilir islem onceligine gore calisir
              i)Uslu Sayilar
              ii)Parantez ici
              iii)carpma/bolme
              iv) toplama/cikarma

         */

        String a = "K";
        int b=3 , c=5,d=2;
        System.out.println(a+b*c/d);




    }







}
