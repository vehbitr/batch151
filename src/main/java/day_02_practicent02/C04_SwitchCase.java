package day_02_practicent02;

public class C04_SwitchCase {
        /*

        Bir restoranda, müşteriler menüden yemeklerini seçerler.
        Restoran, müşterilerin seçtiği yemeği pişirmek için bir
        program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
        secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
        belirlendigi bir program yaziniz

        */
    public static void main(String[] args) {
        String yemek ="hamburger";

        switch (yemek){
            case "hamburger":
                System.out.println("Hamburger Menusu 200 TL");
                break;
            case "pizza":
                System.out.println("Pizza Menusu 500 TL");
                break;
            case "tavuk":
                System.out.println("Tavuk Menusu 200 TL");
                break;
            default:
                System.out.println("Oyle bir secenek yok ");
        }

        /*
        Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralama ucretine gore
        Toplam odenecek fiyati gosteren kodu yaziniz
        SUV ==> 500.0
        SEDAN ==> 400.0
        HATCBACK ==> 350.0
        geriye kalanlar ==> 300.0
        double toplamUcret = kiralamaUcreti * kiralamaGunSayisi;
         */

        String aracTuru ="SUV";
        int kiralanacakGunSayisi = 5;
        double kiralamaUcreti;

        switch (aracTuru){
            case "SUV":
                kiralamaUcreti=500.0;
                break;
            case "SEDAN":
                kiralamaUcreti=400.0;
                break;
            case "HATCBACK":
                kiralamaUcreti=350.0;
                break;
            default:
                kiralamaUcreti=300.0;
        }

        double toplamUcret=kiralamaUcreti* kiralanacakGunSayisi;
        System.out.println("toplamUcret = " + toplamUcret);

        /*
        Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
        gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
        istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
        onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
        kontrol eden bir program yaziniz  (elephant,  lion ,giraffe  )
        default  ==> belirtile hayvan bulunamadi
         */

    }
}
