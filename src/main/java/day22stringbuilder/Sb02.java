package day22stringbuilder;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);// Java is easy

        sb1.reverse();// String'in ters cevrilmesi looplar ilede yapilir, bu kisa bir yoldur.
        System.out.println(sb1);// ysae si avaJ

        sb1.deleteCharAt(6);//Verilen index'deki character'i siler
        System.out.println(sb1);// ysae s avaJ

        sb1.delete(4,7);//Baslangic index'inden bitis indexs'ine(haric) kadar olan character'leri siler.
        System.out.println(sb1);// ysaeavaJ

        sb1.replace(2,5,"X");// replace(2,5,"X") ==> 2 dahil, 5 haric ==> index 2, 3, ve 4 deki character'ler yerine X koyar.
        System.out.println(sb1);// ysXvaJ

        sb1.insert(3,"2023");// Ilk uc character'i gec ardından yazdir.
        System.out.println(sb1);// ysX2023vaJ


        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);// Sonuc 0 ise alfabetik olarak ayni siradalar demektir
                               // Sonuc mesela -3  ise sb1, sb2 den alfabetik olarak 3 onde demektir.
                               // Sonuc mesela 3  ise sb2, sb3 den alfabetik olarak 3 sonra demektir.

        //StringBuilder nasil String'e cevrilir?
        String str = sb1.toString().toUpperCase();
        System.out.println(str);// String YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);// StringBuilder YSX2023VAJ




    }

}
