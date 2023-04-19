package tekrarlar;

import java.util.Scanner;

public class Sorucozum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu ve kilonuzu giriniz");
        double kilo = input.nextDouble();
        double boy = input.nextDouble();

        double BMI= (kilo / (boy*boy));

        System.out.println("Agirlik : "+kilo);
        System.out.println("Boy : "+boy);
        System.out.println("BMI : "+BMI);

        if (BMI< 18.5){
            System.out.println("Zayifsiniz");
        } else if (BMI>=18.5 && 25>BMI) {
            System.out.println("Kilonuz idealdir");
        } else if (BMI>=25 && 30>BMI) {
            System.out.println("Sismansiniz");
        }else if (BMI>=30){
            System.out.println("Obez");
        }


    }
}
