package day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";

    public int age = 23;

    //Encapsulation nedir? Data saklamaktir(Data hiding)
    //Data'yi nasil saklarsiniz? Access Modifier'ini "private" yaparak.
    //Ozel datalarin butun class'lara acik olmasini engellememiz gerekir. Cunku bir data tum classlara aciksa hacklenebilir.

    private String stdId = "AC2023102T";
    private double gpa = 3.87;
    private boolean successful = false;

    //Encapsulation yaptigimiz data'yi istersek okuyabiliriz.
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    //i)get method'lari hep public olur ii)get method'un "return type"i okudugu variable'in return type'i ile ayni olur
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar
    public String getStdId() {
        return stdId;
    }


    public double getGpa() {
        return gpa;
    }

    //Encapsulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar.
    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz.
    //Nasil degistirebiliriz? "set method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    //i)set method'lari hep "public" olur ii)set method'un "return type"i hep void olur.
    //iii)set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    //iv)set method kullanarak var olan object uzerinde degisiklikler yaparak sanki yeni bir object'mis gibi kullanabiliriz
    //Note: get method'larin diger adi "getter", set method'larin diger adi "setter" dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
