package day09_stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // ******************* isEmpty() **************** \\

        /*
        isEmpty() bos mu dolu mu diye bakar.Bize boolean deger dondurur
                    Sadece hiçlikte true dondurur

         */



        // Ex : Bir String'in hic karakter icerip icermedigini gosteren kodu yaziniz
        String str = "";
        // 1. yol lenght()
        boolean bosMu = str.length()==0;
        // 2 is yaptirildi lenght() + ==0 ile karsilastirma operatoru kullanildi
        System.out.println("bosMu = " + bosMu);

        // 2. yol isEmpty()
        boolean bosMu2 = str.isEmpty();
        // bir is yaptirildi isEmpty() Makbul olan isEmpty() methodudur
        System.out.println("bosMu2 = " + bosMu2);

        // Ex: Bir String'in bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz
        String str2 = "  ";
        // 1. yol
        boolean result = str2.replaceAll("  ","").length()==0;
        System.out.println("result = " + result);

        //2. yol
        boolean result2 = str2.replaceAll("  ","").isEmpty();
        System.out.println("result2 = " + result2);

        // Ex: Bir String'in "*" haric hicbir karakter icermedigini kontrol eden kodu yaziniz
        String str3 = "*";

        boolean rslt = str3.replace("*","").length()==0;
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt = " + rslt);
        System.out.println("rslt2 = " + rslt2);


        // ************** isBlank ***************** \\

        /*
        isBlank methodu String bir datada space + hiclik icin true dondurur
                Bos mu dolu mu kontrol eder.Boolean  bir deger dondurur
                isEmpty den farki variable da
                sadece space varsa bos mu dolu mu diye soruldugunda isBlank == Bos der
                                                                    isEmpty == Dolu degil der
         */
        // String str2 = "  ";
        boolean rslt3= str2.isBlank();
        System.out.println("rslt3 = " + rslt3);//true

        boolean rslt4 = str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);//false

        // ************** indexOf() ************* \\
        /*
        indexof() methodu verilen karakter veya karakterlerin ilk gorunumunun indexsini verir
                Tekli karakter iciinde, coklu karakter icinde kullanıla bilir
                Coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin indexsini dondurur
                Olmayan bir datanın kacıncı indexte oldugunu sorgulatırsak bize -1 dondurur
         */

        // Ex : bir Stringde a, i, e karakterlerinin ilk gorunumlerinin indexlerinin toplamını ekrana  yazdırın
        String r = "Java is easy to Learn";

        int aIdx = r.indexOf('a');
        System.out.println("aIdx = " + aIdx);//1

        int iIdx = r.indexOf('i');
        System.out.println("iIdx = " + iIdx);//5

        int eIdx  = r.indexOf('e');
        System.out.println("eIdx = " + eIdx);//8

        System.out.println("aIdx + eIdx + iIdx = " + (eIdx + aIdx + iIdx));

        // Ex : Bir String'de Java kelimesinin ilk olarak kacinci index'de
        // kullanildigini gosteren kodu yaziniz
        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int IdxJava = u.indexOf("Java");
        System.out.println("uIdx = " + IdxJava);

        int IdxPyton = u.indexOf("Pyton");
        System.out.println("uIdx = " + IdxPyton);//-1

        // ************ lastIndexOf () methodu ************ \\
        /*
        lastIndexOf() Verilen bir datada karakter yada karakterlerin son gorunumunun Indexlerini verir
                Tekli karakter iciinde, coklu karakter icinde kullanıla bilir
                Coklu datalarda String ifadenin son gorunumunun ilk karakterinin indexsini dondurur
                Olmayan bir datanın kacıncı indexte oldugunu sorgulatırsak bize -1 dondurur
         */

        // Ex : Bir String de a ,i ,e karakterlerinin son gorunumlerinin
//      indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to Learn";

        int aLastIdx = v.lastIndexOf('a');
        System.out.println("aLastIdx = " + aLastIdx);//1

        int iLastIdx = v.lastIndexOf('i');
        System.out.println("iLastIdx = " + iLastIdx);//5

        int eLastIdx  = v.lastIndexOf('e');
        System.out.println("eLastIdx = " + eLastIdx);//8

        System.out.println("eLastIdx + iLastIdx + aLastIdx = " +(eLastIdx + aLastIdx + iLastIdx));









    }
}
