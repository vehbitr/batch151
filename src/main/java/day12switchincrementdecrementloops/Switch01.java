package day12switchincrementdecrementloops;

public class Switch01 {

    /*
    Ay numarasi verildiginde ayin ismini e Decembere kadarki tum aylarin isimlerini yazdirin consola yazdiran kodu yaziniz.
 */
    /*
    Not : switch parantez icinde "String", "int", "byte", "short" ve char kullanilabilir
                    "boolean", "float", "double", "long" kullanilmaz
     */

    public static void main(String[] args) {

        int monthNumber = 3;

        switch (monthNumber){

            case 1:
                System.out.println("January");
                //break;
            case 2:
                System.out.println("February");
                //break;
            case 3:
                System.out.println("March");
                //break;
            case 4:
                System.out.println("April");
                //break;
            case 5:
                System.out.println("May");
                //break;
            case 6:
                System.out.println("June");
                //break;
            case 7:
                System.out.println("July");
                //break;
            case 8:
                System.out.println("Agust");
                //break;
            case 9:
                System.out.println("September");
                //break;
            case 10:
                System.out.println("October");
                //break;
            case 11:
                System.out.println("November");
                //break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");


        }

    }

}
