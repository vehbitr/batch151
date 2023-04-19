package day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*
        Numeric Data Type'larinin birbirine donusturulmesine Type Casting denir.
        Numeric Data Type'lari byte < short < int < long < float < double

        Kucuk Data Type'larinin Buyuk Data typelarina donusturulmesine
    "Auto Widening"(Otomatik Genisletme) denir ==> Kucuk Kutunun Buyuk Kutu
    icerisine yerlestirilmesi.

    Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
    Data kaybi olabilecegi icin code'u yazanlara birakir.Buna "Explicit Narrowing"
     (Aciktan Daraltma ) denir

         */

        byte age = 13;
        int ageİnt= age;//Auto Widening (Otomatik Genişletme)

        long population = 1234;
        short newPopulation = (short) population;//Explicit Narrowing (Aciktan Daraltma)

        int village = 450;
        float newVillage = village;

        short numberShort = 115;
        byte byteNumber = (byte) numberShort;



    }//main

}//class
