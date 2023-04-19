package day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        // *****************ExplicitNarrowing ****************** \\

        /*  Explicit Narrowing yaparken dikkat edilmeli.
            Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
            Eger donusturmeye calistigimiz variable'in sinirlari
            disinde ise Java sayiyi mod islemine alir ve kalani yazdirir.
            Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
            bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir
        */


        //
        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);//4

        short newbyt = numByte;

        short num2=1023;
        byte num2Byte= (byte) num2;
        System.out.println("num2Byte = " + num2Byte);

        short num3=1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte);

        int intSayi = 8880;
        short shortSayi= (short) intSayi;
        System.out.println("shortSayi = " + shortSayi);



    }
}
