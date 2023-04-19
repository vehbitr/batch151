package day22stringbuilder;

public class Sb01 {

    /*
        1)"StringBuilder" String ureten bir Class'dir
        2)"String" Class kullanarak String uretiriz Java nicin "StringBuilder" Class'i da olusturdu?
          "String" Class "immutable" (degistirilemez) String uretir, "StringBuilder" Class "mutable"(degistirilebilir) String uretir.
        3)"immutable" olmak demek orjinal degerin korunmasi, degistirilmez olmasi demektir.
          "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
        4)"capacity" Java'nin size verdigi data depolama yer sayisidir.
           Lenght ise size verilen data depolama yerinin kullanilan kismidir.
        5)Java baslangic olarak size capacity'i 16 olarak verir.
          Siz verilen capacity'i asarsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.
     */

    public static void main(String[] args) {

        String s = "Java";

        //s + "!" ;

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasil olusturulur?

        //1.Way:
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);//Python

        //StringBuilder'lara nasil ekleme yapilabilir?
        t.append("!").append("...");
        System.out.println(t);//Python!...

        //2.Way:
        StringBuilder r = new StringBuilder();
        System.out.println();

        r.append('c');
        System.out.println(r);

        //"capacity" ve "lenght" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();// 21
        System.out.println(capacity);

        int lenght = sb1.length();
        System.out.println(lenght);// "Money" ==> 5

        sb1.append("!");

        int c = sb1.capacity();
        System.out.println(c);

        int ln = sb1.length();
        System.out.println(ln);

        //Default capacity'i degistirebiliriz.
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());

        sb2.append("...");
        System.out.println(sb2.capacity());//6


    }

}
