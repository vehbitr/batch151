package day13loops;

public class Loopstekrar01 {
    public static void main(String[] args) {

        // 21'den 180'e kadar hem 4 hem de 6 ile bolune bilen tam sayilari consol'a yazdiran kodu yaziniz

        for (int i = 21;i<181;i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyukk harfe donusturunuz
        //miami==>MiAmI

        String s = "miami";

        for (int i = 0; i<s.length();i++){
            String t = s.substring(i,i +1);
            if (i%2==0){
                System.out.print(t.toUpperCase());
            }else {
                System.out.print(t);
            }
        }

        System.out.println();

        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J

        String str = "Hello Java";

        for (int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == 'a'){
                break;
            }else {
                System.out.print(c);
            }
        }

        //Verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci"==>ict
        String u = "Tokatci";
        for (int i = u.length()-1 ; i>=0;i--){
            char ch = u.charAt(i);
            if (ch =='a'){
                break;
            }else {
                System.out.print(ch);
            }
        }



    }
}
