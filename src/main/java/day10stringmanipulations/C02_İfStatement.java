package day10stringmanipulations;

import java.util.Scanner;

public class C02_İfStatement {
    public static void main(String[] args) {

        // Kullanici gun ismini girsin kod gunu yazsin
        // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
        // 5== Persembe  6 == Cuma  7 == Cumartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Gun Numarasini Giriniz\n " +
                " 1 ==> Pazar 2 ==Pazartesi " +
                " 3 ==Sali  4== Carsamba\n" +
                " 5== Persembe  6 == Cuma  7 == Cumartesi\n");
        byte gunNo = input.nextByte();

        if (gunNo == 1){
            System.out.println("Pazar");
        }else if (gunNo == 2){
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Sali");
        } else if (gunNo == 4) {
            System.out.println("Carsamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Lutfen Gun Numarasini Giriniz\n " +
                    " 1 ==> Pazar 2 ==Pazartesi " +
                    " 3 ==Sali  4== Carsamba\n" +
                    " 5== Persembe  6 == Cuma  7 == Cumartesi\n");
        }












    }//main
}//class
