package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLasstCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanTree(names));
        System.out.println(atLeastOneLengthLessThanFour(names));


    }
    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
    public static List<String> sortWithLasstCharDistinctUpperInList(List<String> names){

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//Normalde distinct elemanlari depolamak icin "Set" kullanilir
                                             //ama lambda'daki collect(Collectors.toSet()); method'u elemanlari
                                             //rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
                                             //Bu yuzden mecburen collect(Collectors.toList());
    }

    //Example 2: List elemanlarini character saiyilarina gore ters sirada kucuk harfle bir list'in icinde return ediniz.
    //           Ayni character sayisina sahip elemanlar kendi icinde alfebetik sirada olsun
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){

        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //Example 3: List elemanlarini tamaminin character saiyilarinin 2 den buyuk olup olmadigini kontrol eden method'u olsuturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){

        return names.
                stream().
                allMatch(t->t.length()>2);

    }

    //Example 4: List elemanlarini hicbirinin character saiyilarinin 3 den kucuk olmadigini kontrol eden method'u olsuturunuz.
    public static boolean noLengthLessThanTree(List<String> names){

        return names.
                stream().
                noneMatch(t->t.length()<3);
    }

    //Example 5: List elemanlarini en az birinin character saiyisinin 4 den kucuk olup olmadigini kontrol eden method'u olsuturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){

        return names.
                stream().
                anyMatch(t->t.length()<4);

    }

    /*
        Match
            allMatch() ==> tum elemanlar sarti saglarsa true dondurur
            anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
            noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
    */

}
