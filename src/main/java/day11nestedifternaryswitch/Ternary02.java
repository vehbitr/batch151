package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    /*
    Kullanicidan bir sayi aliniz o sayi pozitif ise ekrana pozitif yazdirin, degilse ekrana pozitif degil yazdirin
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter an integer");
        int num = input.nextInt();

        String result = num>0 ? "Pozitif" : "Pozitif degil"; // eger sonuc true ise ternary de ilk kısım return edilir :
                                                            // önce gelen kisim yani "Pozitif" false olunca 2. kisim return edilir
        System.out.println( result);

    }

}
