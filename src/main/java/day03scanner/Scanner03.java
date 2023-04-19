package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanicidan adresiniz aliniz ve ekrana yazdiriniz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");
        //next() method'u tek kelimeli String'i almak icin kullanilir.
        //nextLine() method'u kullanicidan cok kelimeli Stringi almak icin kullanilir.

        String address = input.nextLine();

        System.out.println(address);









    }
}
