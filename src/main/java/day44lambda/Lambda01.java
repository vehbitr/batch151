package day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1: Verilen tesx file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                forEach(System.out::println);

        //Example 2: Verilen tesx file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3: Verilen tesx file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden code'u yaziniz.
        boolean r1 = Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4: Verilen tesx file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).
                distinct()
                .collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen tesx file icindeki text'de toplam kac harf kullanildigini gosteren code'u yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();//kendisinden sonra method kullanilmasina musade etmeyen method lara terminal method denir.
        System.out.println(numOfLetters);

        //Example 5: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //           icinde return eden kodu yaziniz.
        List<String> letters =   Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);








    }

}
