package PracticeDay06typecastingstringmanipulation;

public class PracticeDay_06 {
    public static void main(String[] args) {

        String a = "Vehbi Demirezen";

        //*******  toUpperCase()  **********\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);//tum harfleri buyuk harf yapar

        // ******* toLowerCase() *********** \\
        String aLower = a.toLowerCase();//tum harfleri kucuk harf yapar
        System.out.println("aLower = " + aLower);

        // ******* charAt() *********** \\
        char secondChar = a.charAt(6);// ==> charAt() method'u icine yazdığımız indexteki karakteri ekranan yazdırir
        System.out.println("secondChar = " + secondChar);//İndex 0'dan baslar

        // ******* lenght() *********** \\
        System.out.println(a.length());// a variable'nin kac karakterden olusturduğunu ekrana yazırır.

        // ******* substring() *********** \\
        System.out.println(a.substring(3, 9));/* iki kullanımı vardır 1 ==> baslangic ve bitis indexi verilirse
                                              baslangic indexi dahil bitis indexi haric yazilir
                                              substring(baslangicIndexiDahil,bitisIndexiHaric); */
        System.out.println(a.substring(6));/* ikinci kullanım şekli baslangic indexsinden son karaktere kadar
                                                        yazdirir */

        // ******* contains() *********** \\
        System.out.println(a.contains("dem"));//a.contains() methodu parantez icine yazılan iceriğin variable'da olup
        System.out.println(a.contains("Dem"));//olmadigini kontrol eder boolean deger donduren bir methoddur.
                                              //Buyuk harf Kucuk harfe duyarlidir

        // ******* startsWith() *********** \\
        // a String'inin V harfiyle baslayip baslamadigini kontrol ediniz
        System.out.println(a.startsWith("V"));// iki kullanım şekli vardir bir => baslangıc harfini kontrol etme
        System.out.println(a.startsWith("Dem" ,6));/* ilk 6 karakteri at "Dem" kelimesi ile baslıyor mu
                                                                bize boolean bir deger dondurur Buyuk harf kucuk harfe duyarlidir. */




    }
}
