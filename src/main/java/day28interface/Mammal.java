package day28interface;

        /*    Child     Parent
            1)Class --> Class : extends
              interface --> interface : implements
              Class --> interface : implements
              interface --> Class : olamaz...
              Ayni ise "extends, farkli ise "implements" kullan.
              "interface" i Class'in child'i yapma

              abstract class ile interface arasindaki farklar nelerdir?
              *1)Abstract Class'lar hem "abstract" hem de "concrete" methodlar icerebilir fakat  interface'ler sadece "abstarct" method icerir.
                Ama interface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebilirsiniz.
              *2)Abstract Class'lar multilevel inheritance'i desteklemez ama interface'ler destekler.
              *3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadir.
              4)"interface" Class'in child'i olamaz ama "abstract classs" class'in child'i olabilir.
              5)abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.

         */

public interface Mammal extends Animal {

    String feedBaby = "Milk";

    int age = 6;

}
