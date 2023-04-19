package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        /*
            1)Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) bir birinden ayrilir.
            Yanii; logic data'ya bagimli olmamalidir.
            data'ya bagimli olarak yazilan kod'lara "hard code" denir.
            "hard code" hatali kod demektir.

            Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
            "4" kullanirsaniz array'e bir eleman eklediginizde kodunuz yanlis cikti veirir ama "grades.length-1"
            kullanirsaniz hep dogru sonucu alirsiniz

         */

       //Array'leri kisa yoldan nasil olustura biliriz?
       int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

        //Example 1: grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0] + grades[grades.length-1]);

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleriu console'a yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }

        System.out.println();

        //Example 3: Size verilen bir String array'deki isimleri alfebetik siraya koyduktan sonra F ile baslayan
        //           isimlerden  onceki isimlerden console'a yazdiriniz.

        Arrays.sort(stdNames);

        for (String w : stdNames){
            if (w.startsWith("F")){
                break;
            }

            System.out.println(w);

        }

        System.out.println();

        //Example 4: Size verilen bir String array'deki isimleri alfebetik siraya koyduktan sonra F ile baslayan
        //           isimlerden  onceki isimlerden ve "F" ile baslayanlari console'a yazdiriniz.

        Arrays.sort(stdNames);

        for (String w : stdNames){
            System.out.println(w);

            if (w.startsWith("F")){
                break;
            }

        }

        System.out.println();

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames);//sort() method'u numeric data'lari kucukten buyuge(ascending) dizer.
                              //String'leri ise alfabetik sirada(alphabetically) dizer.
                              //ascending + alphabetically==> Naturel Order

        for (String w : stdNames){
            if (w.startsWith("F")){
                continue;
            }else {
                System.out.println(w);
            }

        }

    }
}
