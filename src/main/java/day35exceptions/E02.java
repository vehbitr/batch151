package day35exceptions;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java",2));

        System.out.println(getCharFromString("Java",8));

    }

    //Example 1: Bir String'deki charcacter'i index kullanarak alan bir method olusturunuz.
    public static char getCharFromString(String str,int idx){

        try {
            return str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){//StringIndexOutOfBoundsException String'lerde olmayan index kullanildiginda atilir

            idx = Math.abs(idx);

            idx = idx%str.length();

            return str.charAt(idx);

        }

    }

}
