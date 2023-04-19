package day_06_practice;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner input = new Scanner(System.in);

        System.out.println("1-4 Arasinda Islem Numaranizi Giriniz" + "\n"+
                "Islem 1: Bakiye Sorgulama" + "\n" +
                "Islem 2: Para Cekme"+"\n"+
                "Islem 3: Para yatirma"+"\n"+
                "Islem 4: Islemi Sonlandir");
        int processNum = input.nextInt();

        int bakiye =1000;

        switch (processNum){
            case 1:
                System.out.println("Bakiyeniz" + bakiye + " $ ");
                break;

            case 2:
                System.out.println("Cekmez Istediginiz Parayi Giriniz");
                int cekilecekPara = input.nextInt();
                if (cekilecekPara<=bakiye){
                    bakiye = bakiye - cekilecekPara;
                    System.out.println("Para Cekme Isleminden sonraki mevcut bakiyeniz "+ bakiye+ " $");
                }else {
                    System.out.println("Bakiyeniz Yetersiz");
                }
                break;

            case 3:
                System.out.println("Lutfen yatirmak istediginiz miktari giriniz");
                int yatirilacakPara = input.nextInt();

                if (yatirilacakPara<=2000){
                    bakiye =bakiye + yatirilacakPara;
                    System.out.println("Para Yatirma Isleminden Sonraki Mevcut Bakiyeniz " +bakiye+" $" );
                }else {
                    System.out.println("ATM'de Gunluk Para Yatirma Limiti 2000 $");
                }
                break;

            case 4:
                System.out.println("Techpro Bank'i Kullandiginiz icin tesekkurler ");
                break;

            default:
                System.out.println("Gecerli Bir Numara Giriniz");
        }

    }

}
