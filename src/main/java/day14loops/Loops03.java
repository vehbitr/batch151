package day14loops;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {

        //while loop
        int i=1;

        while (i<1){// while loop'da loop body'sinin hic calismamasi mukundur.(Zero execution is possible)
            System.out.println("while loop");
            i++;
        }

        //do-while-loop
        int k =1;
        do {// do-while loop'ta loop ilk degeri yazdirir
            System.out.println("do while loop");
            k++;
        }while (k<1);

        //Kullanici bir sayi girsin, sayi 100 den kucuk ise kullanici "Kazandiniz" mesaji alsin.
        //diger durumlarda "Kaybettiniz" mesaji alsin

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Please enter an integer");
            int n = input.nextInt();

            if (n<100){
                System.out.println("Won!");
            }else {
                System.out.println("Lost!");
                break;
            }

        }while (true);

        //Kullanicidan aldinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz

        do {

            System.out.println("Please enter a word");
            String s = input.next();
            if (s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else {
                System.out.println("Your sentence has grammatically mistake");
                break;
            }
        }while (true);







    }

}
