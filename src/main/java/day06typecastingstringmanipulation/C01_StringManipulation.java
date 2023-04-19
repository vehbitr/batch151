package day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Tek Rakibim Dunku Ben";
        //*******  toUpperCase()  **********\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);//aUpper = TEK RAKİBİM DUNKU BEN .

        // ******* toLowerCase() *********** \\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);

        // ******* charAt() *********** \\
        System.out.println("ilk karakter= " + a.charAt(0));
        System.out.println(a.charAt(10));//m

        // a String'indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz
        char firstchar =a.charAt(1);
        char lastSecondChar = a.charAt(19);
        System.out.println("firstchar+ lastSecondChar =" + firstchar + lastSecondChar);

        // ******* lenght() *********** \\
        // a Stringinde bulunan karakter sayisini bulunuz
        System.out.println(a.length());

        // ******* substring() *********** \\
        // a Stringin deki ilk  4 datayi alinzi
        System.out.println(a.substring(0, 4));


        System.out.println(a.substring(4,7));
        // a String'indeki "Rakib" kelimesini aliniz
        System.out.println(a.substring(4,9));

        System.out.println(a.substring(10));//m Dunku Ben


        // ******* contains() *********** \\
        // a String'inde bim  kelimesinin olup olmadigini kontrol ediniz
        boolean varMi = a.contains("bim");// buyuk harf kucuk harfe duyarlidir
        System.out.println("varMi = " + varMi); //true

        // ******* startsWith() *********** \\

        // a String'inin T harfiyle baslayip baslamadigini kontrol ediniz
        System.out.println(a.startsWith("T"));//true
        System.out.println(a.startsWith("Rak", 4));
        //true ilk  4 karakteri at; sonrasi Rak keliesi ile basliyor mu ?
        //prefix baslangic offset : at gitsin


        String str ="20105501";
        System.out.println(str.startsWith("33", 4));//false


    }
}
