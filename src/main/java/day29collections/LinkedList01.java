package day29collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1)LinkList'ler node silme ve ekleme'de cok basarili olduklari icin,
          silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkList kullaniniz.
        2)ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
          Note: Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi) LinkList,
                "search" islemleri yapacaksa (Amerika eyaletleri gibi) ArrayList kullaniniz.
     */

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);

        //s.remove(2);//Ajda
        System.out.println(s);
        //s.remove("Ajdar");
        System.out.println(s);
        //s.remove();
        System.out.println(s);
        //s.removeFirstOccurrence("Esra");
        System.out.println(s);
        //s.removeLastOccurrence("Esra");
        System.out.println(s);

        /*
            Retrieves, but does not remove, the head (first element) of this list.
            Returns: the head of this list, or null if this list is empty
         */

        String r1 = s.peek();//Ilk node silmeden size verir. (Copy-Paste)
        System.out.println(r1);
        System.out.println(s);

        String r2 = s.poll();//Ilk node silmeden size verir ve list'ten siler.(Cut-Paste)
        System.out.println(r2);
        System.out.println(s);

        /*
            Retrieves, but does not remove, the head (first element) of this list.
            Throws: NoSuchElementException – if this list is empty
            Note: peek() ile element() ikiside ilk elemani silmeden size verir.
                  Ama peek() list bos oldugunda size "null" verir, element() ise "hata" verir.
         */
        String r3 = s.element();//Ilk elemani silmeden size verir(copy + paste)
        System.out.println(r3);
        System.out.println(s);

        /*
            Removes and returns the first element of this list.
            Throws: NoSuchElementException – if this list is empty
            Note: poll() ile pop() ikiside ilk elemani silmeden size verir.
                  Ama poll() list bos oldugunda size "null" verir, pop() ise "hata" verir.
         */

        String r4 = s.pop();
        System.out.println(r4);
        System.out.println(s);


    }

}
