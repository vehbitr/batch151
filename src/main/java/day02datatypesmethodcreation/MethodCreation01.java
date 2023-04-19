package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java'da Method nasil olusturulur?
    1)main method'un disinda olusturulur.
    2)Access Modifier + Return Type + Method Name + () + {}
    Olusturulan Method'lar nasil kullanilir?
    1)main method'un icinden kullanilir.
    2)method'un ismi + () yazin
    3)islem yapacaginiz parametreler parantezin icine koyulur.
    ==>main method static oldugu icin, main method icerisinde kullanacaginiz her sey static olmalidir
     */
    public static void main(String[] args) {
        int sonuc1 = toplamaYap( 30, 60);

        System.out.println(sonuc1);
        long sonuc2 = multiply(10, 2);

        System.out.println(sonuc2);
        int sonuc3 = firstTwoMultiplyThirdAdd(5, 10, 2);

        System.out.println(sonuc3);
        double sonuc4 = getCube(5);

        System.out.println(sonuc4);
        print("Hello World");
    }//main method
    //Ornek 1: Toplama islemi yapan bir method olusturunuz.
    public static int toplamaYap (int a, int b){
        return a+b;
    }
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
    protected static long multiply(long a, int b){
        return a*b;
    }
    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }
    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan method olusturup kullaniniz.
    //Note: Access Modifier'i "Default" yapmak isterseniz access modifier yazmayiniz.
    static double getCube(double a){
        return a*a*a;
    }
    //Ornek 5:  Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    //return type'i "void" oldugunda return keyword kullanilmaz.
    public static void print(String str){
        System.out.println(str);
    }
}
