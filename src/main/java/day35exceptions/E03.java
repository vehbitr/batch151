package day35exceptions;

public class E03 {

    /*
        1)try block'dan sonra coklu catch block kullanilabilir.
          catch block'lardan arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
          catch block'lardan arasinda parent-child iliskisi varsa child ustte olmalidir.
        2)"Exception Class" tum Exception'larin parent'idir.
          Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
          tek catch block'i "Exception Class" ile kullanabilirsiniz.
        3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz.
          "try + finally" olabilir.
     */

    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLenght1("6"));
        System.out.println(convertStringToIntDivideByLenght2("6"));
        System.out.println(convertStringToIntDivideByLenght3("6"));

    }

    //Example 1: Bir String'i integer'a ceviren ve bu integer'i String'in lenght'inin 1 eksigine bolen method'u olusturunuz

    public static int convertStringToIntDivideByLenght1(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
             result = a / (str.length() - 1);
        }catch (NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int convertStringToIntDivideByLenght2(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int convertStringToIntDivideByLenght3(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch (ArithmeticException e){//Exception'larda parent child iliskisi varsa child yukarda olmali ozelden genele
                                       // Exception yukarda olursa Arithmetic'i kapsadigi icin Altta kalan Arithmetik calismaz o yuzden arithmethic altta olmali
                                       //child yukarida olmalidir özel olan yukarda olmali genel olan assagida genel yukarda olup ozel assagida kalirsa hata aliriz
            System.out.println("Jump");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

}
