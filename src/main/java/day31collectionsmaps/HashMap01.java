package day31collectionsmaps;

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {

        /*
        MY NOTES:
           Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
           "key" kismi tekrarsiz, "value tekrarli olabilir.
           Mapler "Key" ve "Value" structur'ini kullanir.
           Map'lerdeki elemanlara "Entry" denir.
           Elemanlarin tamanina ise "EntrySet" denilir.
           "Entry"ler tekrarsiz oldugu icin "EntrySet" denilir.
           "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
           "Map"'ler Collection degildir, farkli bir yapidir.

           HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir

                */

        //Map nasil olusturlur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);

        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        // get() method'u "key" ile calisir ve "value" kismini verir
        int usePopulation = countryPopulation.get("USA");
        System.out.println(usePopulation);

        //Butun key'Leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);// [Turkiye, Netherland, USA, Germany, Albania]

        // Butun "value"lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);

        //Example 1: countryPopulation map'İndeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();

        int sum = 0;

        for (Integer w : value){
            sum = sum + w;
        }

        System.out.println(sum/value.size());//117400000

        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);// [Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        //Example 2: countryPopulation map'İndeki ulkelerin isimlerinin character sayisi ile nufus toplamini bulunuz.
        int toplam = 0;

        for (Map.Entry<String,Integer> w : entries){
            toplam = toplam + w.getKey().length() + w.getValue();
        }

        System.out.println(toplam);




    }

}
