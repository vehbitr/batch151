package day02datatypesmethodcreation;

public class Variables01 {
    /* javada temelde iki tip data vardir
    1)primitive data type:
    char, boolean, byte, short, int, long , float, double
    2)non-primitive:
        String
     */
    /*
    Note 1: primitive data tyoe'ları java oluşturmuştur, biz olusturamayiz
    Note 2: primitive data type'ların isimlerinde sadece kucuk harf kullanılır
    Note 3: primitive datalar'lar data type'larına göre memory' farkli farkli yer kaplarlar
    note4  primitive datalar içlerinde sadece sizin atadağınız değeri barındırırlar.
     */

    /*
    non-primitive data types:
       1)Ornegin String non-primitive örnegidir
       2)Uretilen her class aynı zamanda bir "non-primitive data type'dır"
       3)Bu yuzden non-primitive data type'lar sınırsız sayıdadır.
       4)non-primitive data typların isimleri buyuk harf ile baslar.
       5)non-primitive data typların tamamı icin java memoryde aynı miktarda yer ayırır.

     */
    public static void main(String[] args) {
        String cityName = "Ankara";
        System.out.println(cityName);

        int a = 13;
    /*
        Interview sorusu: "primitive" ve "non-primitive " data type'lar arasindaki fark nedir?
        1)"primitive"ler sadece bizim atadigimiz degeri icerir;
          "non-primitive" ler bizim atadigimiz deger ve methodlar icerir
        2)"primitive"ler kucuk harfle baslar, "non-primitive" ler buyuk harf ile baslar
        3)"primitive"leri java uretmistir 8 tanedir
          "non-primitive"leri  java ve developerlar uretebilir bu yuzden sinirsiz sayidadir
        4)"primitive" ler memory de data type'ina gore yer kaplar
          "non-primitive" ler icin java memory'de hep ayni buyuklukte yer ayirir.
     */
    }

}
