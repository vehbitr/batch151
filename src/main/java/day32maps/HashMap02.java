package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you you, like like!";
        System.out.println(s);//I like you, like like!

        //like ile like! i ayni yapabilmak icin tum noktalama isaretlerini silelim
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //Ben kelimelerle calismaliyim bu yuzden split(" ") kullanacagim
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String,Integer> occ = new HashMap<>();

        //"words" array'indeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" array'indeki kelimeler Map'de yoksa Map'a value'su 1 olarak yerlestirilecek.
        //"words" array'indeki kelimeler Map'de varsa Map'e varolan value'u 1 arttirilarak yerlestirilecek.

        for (String w : words){

            Integer numOfOccurrence = occ.get(w);

            if(numOfOccurrence == null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOccurrence+1);
            }

        }

        System.out.println(occ);//{like=3, I=1, you=2}

    }

}
