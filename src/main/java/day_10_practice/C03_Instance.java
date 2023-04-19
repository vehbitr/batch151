package day_10_practice;

public class C03_Instance {

    int sayi;

    String bransIsmi = "Java";

    boolean okuldaMi;


    public static void main(String[] args) {

    /*

        sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
        Bu instance variable'leri main icerisinde yazdıralım

    */

        //Instance variable'lara static method'dan ulasabilmek icin obje olusturmamiz gerekir

        C03_Instance obj1 = new C03_Instance();

        System.out.println(obj1.sayi);
        System.out.println(obj1.bransIsmi);
        System.out.println(obj1.okuldaMi);

        //Instance variable'lara object'e baglidir
        //Hangi objject uzerinden variable'de degisiklik yapildiysa, yapilan bu degisiklik sadece o object,2i baglar

        System.out.println();

        obj1.sayi=10;
        System.out.println(obj1.sayi);

        C03_Instance obj2 = new C03_Instance();

        System.out.println(obj2.sayi);

        obj1.bransIsmi="SQL";
        System.out.println(obj1.bransIsmi);//SQL

        System.out.println(obj2.bransIsmi);//Java

        System.out.println(obj1.okuldaMi);// false

        obj1.okuldaMi=true;
        System.out.println(obj1.okuldaMi);// true

        System.out.println(obj2.okuldaMi);// false

        obj2.sayi=100;

        System.out.println(obj2.sayi);// 100

        obj2.bransIsmi="API";

        System.out.println(obj2.bransIsmi);// API


    }

}
