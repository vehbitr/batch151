package day_09_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {

    public static void main(String[] args) {

        /*
            kullanıcıdan bir cumle sisteme girmesini isteyiniz.
            method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        String arr[] = sentence.split("");

        System.out.println(Arrays.toString(arr));

        sesliHarfleriYazdir(arr);

    }

    public static void sesliHarfleriYazdir(String[] arr) {

        for (int i = 0;i< arr.length;i++){
            if (arr[i].equalsIgnoreCase("a")
            || arr[i].equalsIgnoreCase("e")
            || arr[i].equalsIgnoreCase("i")
            || arr[i].equalsIgnoreCase("o")
            || arr[i].equalsIgnoreCase("u" )){
                System.out.println(arr[i]);
            }
        }

    }

}
