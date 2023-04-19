package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {

        /*
        Bir array'in elemanlarida array olursa bu tarz array'lere "Multidimensional Array" denir.
         */

    public static void main(String[] args) {

        //"Multidimensional Array" nasil olusturulur?
        String names[][]= new String[3][2];


        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

        //Multidimensional Array"'leri console'a yazdirmak icin toString() method2u degil "deepToString()" method'unu kullaniniz
        System.out.println(Arrays.deepToString(names));

        //"Multidimensional Array" icinden spesifik bir eleman nasil yazdirilir?
        System.out.println(names[1][1]);//M

        //"Multidimensional Array" icindeki bir array'i yazdirmak//[A, K]
        System.out.println(Arrays.toString(names[0]));

        //Kisa yoldan "Multidimensional Array" nasil olusturulur
        String students[][] ={ {"Ali","Kemal"}, {"Cemal"}, {"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayhan"}};

        //Example 1: Yukaridaki students array'inde toplamda kac tane isim oldugunu bulunuz.
        int sum =0;

        for (String[] w :students){
            sum = sum + w.length;
        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz.
        for (String[] w : students){
            for (String k: w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }

        }

        //Example 3: Bir integer "Multidimensional Array" olusturunuz tum elemanlarin carpimini hesaplayiniz
        int nums[][]={{5,4},{2,3,2},{7}};
        int carp = 1;
        for (int[] w : nums){
            for (int l : w ){
                carp=l*carp;
            }
        }
        System.out.println(carp);

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][]={{5,4},{2,3,2},{7}};

        //1.Step: Ikı boyutlu array'de kac eleman oldugunun bulan kodu yaziniz
        int toplamElemanSayisi =0;

        for (int[] w: numbers){
            toplamElemanSayisi = toplamElemanSayisi +w.length;
        }

        //2.Step: Tek boyutlu array' i iki boyutlu array'e eleman sayisini kullanarak olusturmaliyiz
        int newArr[]= new int[toplamElemanSayisi];

        //3.Step: Ikı boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx =0;

        for (int[] w : numbers){

            for (int k :w){
                newArr[idx]=k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5:Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][]={{15,4},{12,43,21},{7}}; // ==> 4 + 43 = 47

        int small=ages[0][0];
        int big = ages[0][0];

        for (int[] w: ages){
            for (int k:w){

                small =Math.min(small,k);
                big =Math.max(big,k);

            }
        }

        System.out.println(small + big);



    }
}
