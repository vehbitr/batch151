package day09_stringmanipulationsifstatement;

public class C02_İfStatement {
    public static void main(String[] args) {

        //INTERWİEW QUESTİONS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        // String y = "abbccdc" ==> orjinal soru

        String y = "aac";//c Soru cozumu cok uzamaması icin y bu sekilde alindi
        char ch = y.charAt(0);
        if (y.indexOf(ch)==y.lastIndexOf(ch)){
            System.out.println(ch);
        }// if body iki curly braces arasi

        char ch1 = y.charAt(1);
        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(2);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        //Ex : Verilen sayi pozitif ise ekrana sayi pozitif yazdiran kodu yaziniz
        int num = 65 ;
        if (num > 0){
            System.out.println("Sayi Pozitif");
        }

        // Ex : Sayi -1 ile 10 arasinda ise ekrana verilen data rakamdır yazdıran kodu yaziniz
        int rakam = 3;
        if (rakam>-1 && rakam<10){
            System.out.println("Verilen data rakamdır. ");
        }

        // Ex : Sayi uc basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz
        int sayi = -100 ;
        sayi = Math.abs(sayi);// Javada Math Classı vardır Math Classının icinden abs methodunu kullandik abs methodu negatif sayiyi mutlak degere aldı
        if (sayi>99 && sayi<1000){
            System.out.println("Verilen Data 3 Basamaklidir");
        }




    }
}
