package day03scanner;

//java' util kutuphanesinden scanner class import edildi demektir
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
    //1.adim: Scanner clas'tan bir obje olustur.
        Scanner input = new Scanner(System.in);
        //obje ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlarimin icerisine koyacak

        //2.adim: Kullaniciya ne istediginize dair mesaj verin
        System.out.println("Lutfen yasinizi giriniz");

        //3.adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz.
        byte age =  input.nextByte();
        System.out.println(age);



    }

}
