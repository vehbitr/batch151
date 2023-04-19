package day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        System.out.println("Constructor 1");
    }

    public StaticNonStaticBlocks02(int price){
        System.out.println("Constructor 2");
    }

    public StaticNonStaticBlocks02(String name){
        System.out.println("Constructor 3");
    }

    public StaticNonStaticBlocks02(boolean isOld){
        System.out.println("Constructor 4");
    }

    //non-static block constructor'larda calistirilmasi gereken ortak kodları icerir.
    //non-static block icindeki kodlar her constructor icin kullanilir.
    //Bir'den fazla non-static block ustteki once calistirilir
    {
        System.out.println("I am constructor - ilk");
    }

    {
        System.out.println("I am constructor - ikinci");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);

    }

}
