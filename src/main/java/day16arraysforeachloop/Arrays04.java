package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));// [Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length);

        //Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz
        String letters[] =s.replaceAll("[^a-zA-z]","").split("");

        System.out.println(Arrays.toString(letters));

        System.out.println(letters.length);

    }
}
