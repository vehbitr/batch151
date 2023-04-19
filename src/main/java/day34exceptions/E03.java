package day34exceptions;

public class E03 {

    public static void main(String[] args) {

        System.out.println(getNumOfChar("Java"));//4
        System.out.println(getNumOfChar("Money"));//5
        System.out.println(getNumOfChar(""));

        System.out.println(getNumOfChar(null));

    }

    //Bir String'deki charecter sayisini veren method olusturunuz.
    public static int getNumOfChar(String s){

        int result =0;

        try {
            result = s.length();

        }catch (NullPointerException e){//NullPointerException String class'da null ile uyumlu olmayan method'lar kullanildiginda atilir

            System.out.println("Some String methods do not work with null...");

            System.out.println(e.getMessage());//Java'nin Exception icin urettigi teknik mesaji varsa verir

        }
        return result;
    }

}
