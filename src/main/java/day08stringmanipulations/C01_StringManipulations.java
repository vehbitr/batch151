package day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        // ******************* replaceFirst () *************** \\
    /*
    replaceFirst() : replace () ile ayni isi yapmakla birlikte
    ilk gördugu datayı degiştirir
     */

        String str = "Bizimle Java Ogrenmek Cok Kolay";
        // Ex : str Stringindeki ilk gördugu "i" harflerinin yerine "e" harfi yerleştiriniz
        String str1 = str.replaceFirst("i","e");
        System.out.println("str1 = " + str1);
        String str2 = str.replace("i","e");
        System.out.println("str2 = " + str2);

        // ************** trim() **************** \\

        /*
        trim() Bir Stringde bastaki ve sondaki Space karakterlerini siler
        Ortadaki Space karakterlerine dokunmaz
         */
        String isim = "   Mehmet Fatih Yildirim  ";
        // Ex : isim String'in deki varsa bas ve sondaki Spaceleri siliniz
        System.out.print("******************");
        System.out.print(isim);
        System.out.print("******************");
        String trimIsim = isim.trim();
        System.out.print("trimIsim =" + trimIsim);
        System.out.print("******************");

        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
         String tv = "599.99$";
        String laptop = "299.99$";
        String tv2 = tv.replace("$","");//"599.99"
        System.out.println("tv2 = " + tv2);
        //$ gordugun yere hic bir sey koyma yani dolar sembolunu sil
        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);

        /*
        valueOf() bize String olan bir datayi sayisal bir
        degere yani islem yapabilecegimizbir degere ceviriyor
         */

        String tamIsim = "mehmet fatih";
        //Verilen tamIsim String'inin icindeki ilk ismin
        // ilk harfiyle son ismin ilk harfini buyuk harf
        // olarak yan yana yazdiriniz ==> MF
        char first = tamIsim.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("first + second = " + first + second);// first + second =MF






    }

}
