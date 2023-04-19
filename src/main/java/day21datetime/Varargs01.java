package day21datetime;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add(5,2,4,3));
        System.out.println(add(5,2));
        System.out.println(add(5));
        System.out.println(add());

        getInitials("Ali Can", "Kemal Han", "Tuncay Cinar");

    }
    //example 1: Toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli methodlar olusturarak is yapamayiz
    //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir, her ihtimal icin bir method olusturmak mumkun degildir.
    /*public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }

    public int add(int a, int b,int c,int d){
        return a+b+c+d;
    }*/

    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu
    //Bu yapiya"Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir

    /*
        1)Bir method parantezinde bir'den fazla "Varargs" kullanilamaz.
        2)Bir method parantezinde bir'den fazla parametre kullanilacaksa "Varargs" en sonda kullanilmalidir.
     */

    public  static int add(int... a){

        int sum = 0;

        for (int w : a){
            sum = sum + w ;
        }
        return sum;
    }

    //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //          Ali Can ==> AC    Kemal Han ==> KH

    public static void getInitials(String... s){

        String initials = "";

        for (String w : s){

            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }
}
