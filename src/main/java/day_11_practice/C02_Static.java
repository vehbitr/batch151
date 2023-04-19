package day_11_practice;

public class C02_Static {

    static String okulIsmi="Yildiz Koleji";

    static int okulNo;

    static boolean okulAcikMi;

     /*

        okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
        Bu static variable'leri main icerisinde yazdıralım

      */

    public static void main(String[] args) {

        //static variable'lara, class icerisindeki tum methodlardan direkt ulasabiliriz

        System.out.println(okulIsmi);
        System.out.println(okulNo);
        System.out.println(okulAcikMi);


        // static variable'lar gokteki ay gibidir static variable'lerin degeri bir kisi tarafindan degistirilirse herkes icin degisiklige ugrar
        // static variable'lar class'a baglidir

        okulNo=102;

        System.out.println(okulNo);
        
        staticMethod();

        System.out.println(okulNo);


    }

    private static void staticMethod() {
        okulNo=200;
    }

}
