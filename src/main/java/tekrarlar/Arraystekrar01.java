package tekrarlar;

import java.util.Scanner;

public class Arraystekrar01 {
    public static void main(String[] args) {

        for (int i = 1 ; i<5;i++){
            System.out.println("Hafta");
            for (int o=1;o<8;o++){
                System.out.println("   gun");
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a rows");
        int rows = input.nextInt();
        System.out.println("Please enter a clousm");
        int colums = input.nextInt();

        for (int r =1;r<=rows;r++){
            for (int c=1;c<=colums;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pleas enter a row");
        int row = input.nextInt();

        for (int m =1;m<=row;m++){
            for (int n =1;n<=m;n++){
                System.out.print(n +" ");
            }
            System.out.println();
        }



    }
}
