package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    /*
         Method olusturmak icin asagidaki 5 adimi takip ediniz.
            1)Access Modifier
            2) Return Type
            3) Method ismi
            4)Method Parantezi
            5) Methodun body'si

         Pass by Value:
            1)Java "Pass By Value" kullanir.
            2)Yani; Java method'larin orijinal degeri degistirmesine musaade etmez
            3)Java method'lara deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi method'a yollar.
             Method kopya deger uzerinde degisiklik yapar, boylece orijinal deger korunmus olur.
            4)Java esnek bir dil'dir. Istersek yazdigimiz kod ile orijinal degerin degismesini de temin edebiliriz.
                (bakiniz 30.satir)
         Pass by Reference:
            1)Pass by Reference da method'a reference yollanir.
            2)Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve
            orjinal degeri degistirir.
            Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable'in orjinal degerini degistirir.
 */

    public static void main(String[] args) {

        int shirtPrice = 200;

        System.out.println(discount("student",shirtPrice));

        System.out.println(shirtPrice);

        shirtPrice=discount("veteran",shirtPrice);
        System.out.println(shirtPrice);

    }

    //Discount Method'u olsuturunuz
    public static  int discount(String type,int price){

        switch (type){
            case "student":
                price = price - 20;
                break;
            case "veteran":
                price = price - 40;
                break;
            case "senior":
                price = price - 30;
                break;
            default:
                price = price;
        }
        return price;
    }

}
