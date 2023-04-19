package day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        // ************* endsWith *********** \\
        /* endsWith() Metnin belirli bir datayla bitip bitmediğini bize verir
                      True yada false seklinde boolean bir deger dondurur.
                      Icerisine tek karakterde coklu karakterde koyabilirsiniz    */

        //Ex: s String'inin "money" ile bitip bitmediğini kontrol ediniz.

       boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);//true


        // ************** replace() **************** \\

        //s String'indeki "money" kalimesini "dolar" kelimesiyle yer degistirelim

        String s1 = s.replace("money" ,"dollar");
        System.out.println("s1 = " + s1);//s1 = Leanr Java earn dollar

        //s String'indeki "earn" kalimesini "win" kelimesiyle yer degistirelim

        String s2 = s.replace("earn", "win");
        System.out.println("s2 = " + s2);//s2 = Lwin Java win money

        //s String'indeki "a" harfini "*" ile degistirelim
         String s3 = s.replace('a','*');
         String s4 = s.replace("a","*");
         // String s5 = s.replace("a" , '*'); ==> aynı turde olmalılar biri String biri char olmaz

        System.out.println("s3 = " + s3);
        //Ex : s String'indeki "L" harfini "***" ile değiştiriniz

        String s6 = s.replace("L","***");
        System.out.println("s6 = " + s6);//s6 = ***earn Java earn money

        //Ex : s String'indeki tüm "e" harfini siliniz
        String s7 = s.replace("e", "");
        System.out.println("s7 = " + s7);
        String s8 = s.replace('e', ' ');
        System.out.println("s8 = " + s8);
        //L arn Java  arn mon y ==> Space ile silme yapılmaz. Space'in
        //Java icin bir anlami vardir.Ve bir karakterdir.
        //Taskte istenilen saglanmamis olur.


        //s String'indeki tüm "earn" kalimelerini siliniz.
        String s9 = s.replace("earn","");
        System.out.println("s9 = " + s9);// s9 = L Java  money


        String t = "Dolma Kalem";
        //Ex : t String'in deki "Kalem" kelimesi yerine biber yerleştiriniz.
        String t1 =t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);// t1 = Dolma Biber

        // ************* replaceAll ************** \\












    }
}
