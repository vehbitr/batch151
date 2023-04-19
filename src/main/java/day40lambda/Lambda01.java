package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","Ordu","Gaziantep","Hatay","Edirne"));
        bykHrfLengthArtanDistinct(iller);
        System.out.println();
        bykHrfSonHrfArtanDistinct(iller);
        System.out.println();
        bykHrfLengthArtanDistinctLengthAlfbtkSira(iller);
        System.out.println();
        System.out.println(chrSysBesFzlOlanlariSil(iller));
        System.out.println();
        System.out.println(startWithHOrEndsWithRElemntDelete(iller));


    }

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLengthArtanDistinct(List<String> iller){
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHrfArtanDistinct(List<String> iller){
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).//Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//Lambda Expression
                forEach(t-> System.out.print(t+" "));

    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfLengthArtanDistinctLengthAlfbtkSira(List<String> iller){
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);//Lambda Expression'da ==> forEach(t-> System.out.print(t+" ")); seklinde yazilir.
                //Method Referance() ==> forEach(System.out::println); seklinde yazilir.

    }


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz
    public static List<String> chrSysBesFzlOlanlariSil(List<String> iller){
        iller.removeIf(t->t.length()>5);
        return iller;
    }


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> startWithHOrEndsWithRElemntDelete(List<String> iller){
        iller.removeIf(t->t.startsWith("H")||t.endsWith("r"));
        return iller;
    }



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
}






