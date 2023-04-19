package day_10_practice;

import java.io.StringReader;
import java.util.Scanner;

public class C01_BurcHesaplama {

    public static void main(String[] args) {

        // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz ayi String ile giriniz");
        String ay = input.next();

        System.out.println("Dogdugunuz gunu int giriniz");
        int  gun = input.nextInt();

        String burc = "";

        if (ay.equalsIgnoreCase("Ocak")){

            if (gun>22){
                burc="Kova";
            }else {
                burc="Oglak";
            }

        }
        if (ay.equalsIgnoreCase("Subat")){

            if (gun>20){
                burc="Balik";
            }else {
                burc="Kova";
            }

        }
        if (ay.equalsIgnoreCase("Mart")){

            if (gun>21){
                burc="Koc";
            }else {
                burc="Balik";
            }

        }
        if (ay.equalsIgnoreCase("Nisan")){

            if (gun>21){
                burc="Boga";
            }else {
                burc="Koc";
            }

        }
        if (ay.equalsIgnoreCase("May")){

            if (gun>22){
                burc="İkizler";
            }else {
                burc="Boga";
            }

        }
        if (ay.equalsIgnoreCase("Haziran")){

            if (gun>23){
                burc="Yengec";
            }else {
                burc="İkizler";
            }

        }
        if (ay.equalsIgnoreCase("Temmuz")){

            if (gun>23){
                burc="Aslan";
            }else {
                burc="Yengec";
            }

        }
        if (ay.equalsIgnoreCase("Agust")){

            if (gun>22){
                burc="Basak";
            }else {
                burc="Aslan";
            }

        }
        if (ay.equalsIgnoreCase("Eylul")){

            if (gun>23){
                burc="Terazi";
            }else {
                burc="Basak";
            }

        }
        if (ay.equalsIgnoreCase("Ekim")){

            if (gun>22){
                burc="Akrep";
            }else {
                burc="Terazi";
            }

        }
        if (ay.equalsIgnoreCase("Kasim")){

            if (gun>22){
                burc="Yay";
            }else {
                burc="Akrep";
            }

        }
        if (ay.equalsIgnoreCase("Aralik")){

            if (gun>22){
                burc="Oglak";
            }else {
                burc="Yay";
            }

        }

        System.out.println(burc);

    }

}
