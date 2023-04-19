package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*
        1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
        2)3 tane Set Class vardir;
            i)HashSet Class:
                    "Hash" benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                    "HashSet" elemanlari rastgele siralar.
                    "HashSet" elemanlari siralamadigindan cok hizli calisir.
                    "HashSet"ler "null"i eleman olarak kabul eder.
                    "HashSet"ler tekrarsiz eleman depolamak icindir.

            ii)LinkedHashSet Class:
                    "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiginden(insertion order)
                     "HashSet"lere gore yavastirlar.
                     "LinkedHashSet"ler tekrarsiz eleman depolamak icindir.

            iii)TreeSet Class:
                    "TreeSet"ler elemanlari natural order'a gore dizerler.
                    "TreeSet"ler elemanlari natural order'a gore dizdiklerinden coooooooook yavastirlar.
        3)TreeSet cok yavas oldugunda mumkun oldugu kadar TreeSet kullanmamaya calisiriz.
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli elemani eklediginizde hata vermez ama tekrarli sadece bir kere ekler.
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        System.out.println(hs.hashCode());// 2038751948

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);
        System.out.println(lhs);// [234, 87, -32, 124]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);// [451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs);// [87, 124] ==> Ilk LinkedHashSet'teki farkli elemanlar silindi
        System.out.println(ls);// [451, 87, 231, 124]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); ==> TreeSet'lere "null" eklenemez.
        System.out.println(ts);// [A, G, R, U, Z]

        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.lower('R'));// Verilen eleman olan R'den bir onceki elemani verir
        System.out.println(ts.lower('D'));// A
        System.out.println(ts.lower('A'));// null

        System.out.println(ts.higher('K'));// Verilen eleman olan K'dan sonraki elemani verir

        System.out.println(ts.headSet('R'));// [A, G] ==> Parantez icerisindeki R dahil degildir. Girdigimiz harfe kadar alir girdigimizi almaz

        System.out.println(ts.headSet('R',true));// [A, G, R]

        System.out.println(ts.tailSet('G'));// [G, R, U, Z] ==> Parantez icerisindeki G dahildir. Girdigimiz harfi de alir.

        System.out.println(ts.tailSet('G',false));// [R, U, Z]

        System.out.println(ts.ceiling('R'));// R ==> eleman set'in icinde varsa eleman'in kendisi return eder.
        System.out.println(ts.ceiling('K'));// R ==> eleman set'in icinde yoksa sonraki elemani return eder.

        System.out.println(ts.floor('G'));// G ==> eleman set'in icinde varsa eleman'in kendisi return eder.
        System.out.println(ts.floor('J'));// G  ==> eleman set'in icinde yoksa onceki elemani return eder.

        System.out.println(ts.subSet('G','Z'));// [G, R, U] ==> Ilk parametre dahil ikinci parametre haric
        System.out.println(ts.subSet('G',false,'Z',true));// [R, U, Z]


    }

}
