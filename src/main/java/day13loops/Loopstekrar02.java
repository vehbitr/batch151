package day13loops;

import javax.swing.*;

public class Loopstekrar02 {
    public static void main(String[] args) {

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" == P12?A

        String s = "Pwd12?Ab";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else {
                System.out.print(ch);
            }
        }

        System.out.println();

        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                i++;
                continue;
            } else {
                System.out.print(ch);
            }
            i++;
        }
        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz. ==> ****interview sorusu****
        String t = "Java";
        String ters = "";

        for (int i1 = t.length() - 1; i1 >= 0; i1--) {
            ters = ters + t.substring(i1, i1 + 1);
        }
        System.out.println(ters);

        System.out.println();

        String u = "Java";
        String ters2 = "";

        for (int i2 = u.length() - 1; i2 >= 0; i2--) {
            ters2 = ters2 + u.charAt(i2);
        }
        System.out.println(ters);

        //Bir tamsayinin rakamlarinin toplamini veren kodu yazdiriniz.
        //578 ==> 5+7+8 = 20

        int top = 0;

        int n = 5784;
        n= Math.abs(n);

        for (int i3 = n ; i3>0; i3/=10){
            top = top + i3%10;
        }
        System.out.println(top);


    }
}

