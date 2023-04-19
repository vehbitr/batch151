package day05_loopsarrays;

public class MonkeyAlive {

    /*
    INTERWIEW SORUSU
       Adada yalnız bir maymun var
       Her gün 4 muz yemesi gerekiyor
       o adada sadece 165 muz var
       Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
   */
    public static void main(String[] args) {

        int bananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            bananas -= 4;
            System.out.println("Kalan muz sayisi " + bananas);

            survivalDays++;
            if (bananas < 4) {
                monkeyAlive=false;
                System.out.println("Today "+ survivalDays + " not enough banana number . R.İ.P");
            }else
                System.out.println("Today " + survivalDays + " .gun; Monkey stay alive");
        }while (monkeyAlive);
    }
}