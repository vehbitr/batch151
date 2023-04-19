package tekrarlar;

import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

public class TekrarSoruları {

    //Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
    //Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);

        System.out.println("If you wanna go out just press '!' ");

        for (int i = 0;true;i++) {

            System.out.println("Please enter a character");
            char ch = input.next().charAt(0);

            if (ch >= 65 && ch <= 90) {
                System.out.println("Buyuk harf");
            } else if (ch >= 97 && ch <= 122) {
                System.out.println("Kucuk harf");
            } else {
                System.out.println("Hatali giris");
            }
            if(ch == '!'){
                System.out.println("cikmis oldun");
                break;
            }
        }*/

        /*Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
                Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
        Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz*/

       /* System.out.println("Lutfen kac adet urun aldiginizi giriniz");
        int urunAdet =  input.nextInt();

        System.out.println("Lutfen urunun liste fiyatini giriniz");
        double listeFiyati = input.nextDouble();

        System.out.println("Musteri kartiniz var mi, varsa true yoksa false yazin.");
        boolean b = input.nextBoolean();

        if (b==true && urunAdet>10){
            System.out.println("Tebrikler %20 indirim kazandiniz");
            listeFiyati =  listeFiyati-(listeFiyati*20/100);
        } else if ((b == false && urunAdet > 10) || (b==true && urunAdet<=10)) {
            System.out.println("Tebrikler %15 indirim kazandiniz");
            listeFiyati = listeFiyati - (listeFiyati*15/100);
        }else if (b==false && urunAdet<=10){
            System.out.println("Tebrikler %10 indirim kazandiniz");
            listeFiyati = listeFiyati - (listeFiyati*10/100);
        }else {
            System.out.println("Lutfen gecerli degerler giriniz!!!");
        }
        System.out.println("Indirimli fiyat: "+(listeFiyati*urunAdet));
   */

        /*
     Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.
     */

        Scanner scan  = new Scanner(System.in);
        System.out.println("lutfen arac hızını giriniz");
        int hiz = scan.nextInt();
        System.out.println("ehliyet var mi?");
        boolean ehliyet=scan.nextBoolean();
        int ceza = 0;

        if (hiz <= 54&& ehliyet== true){
            System.out.println("move on!");
        }else if (hiz <= 54&& ehliyet== false){
            System.out.println("ceza yedin cezan:"+ (ceza= ceza+200));
        }
        if(hiz>=55 && hiz <=74 && ehliyet==true){
            System.out.println(" ceza yedin  cezan: "+(ceza = ceza + 100));
        }else if (hiz>=55 && hiz <=74 && ehliyet==false){
            System.out.println("ceza yedin cezan: "+ (ceza = ceza+ 100+ 200));
        }
        if(hiz>=75 && hiz <=84 && ehliyet==true){
            System.out.println("ceza yedin  cezan:"+ (ceza = ceza + 150));
        }else if (hiz>=75 && hiz <=84 && ehliyet==false) {
            System.out.println("ceza yedin cezan:"+ (ceza = ceza + 150 + 200));
        }if (hiz>=85 && hiz <=94 && ehliyet==true)  {
            System.out.println("ceza yedin  cezan:"+(ceza = ceza + 320));
        } else if (hiz>=85 && hiz <=94 && ehliyet==false) {
            System.out.println("ceza yedin  cezan:"+(ceza = ceza + 320 + 200));
        }
        if (hiz > 94 && ehliyet==true){
            System.out.println("ceza yedin  cezan:"+(ceza = ceza + 500));
        } else if (hiz > 94 && ehliyet==false) {
            System.out.println("ceza yedin  cezan:"+(ceza = ceza + 500));
        }




        }

}

