package day22stringbuilder;

public class Student {

    //stdName "public" oldugu icin diger class'lardan ulasilabilir
    public String stdName = "Ali Can";

    //Access Modifier i "default" olan ve "public" olan class member lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler.
    //fakat farkli package a gectiginizde, "public" olanlara ulasilabilir, "defoult" olanlara
    //ulasilamaz.

    int age = 23;

    //Access Mofoer i "privite" olan Class member lar sadece olusturulduklari Class
    //icinden gorulebilirler.
    //Olusturulduklari class in disina ciktiginizda gorunmez, ulasilamaz olurlar.
    private String healthCondition = "Cancer";

    //Access Modifier i "protected" olan Class member lar ayni package icinde iken :public" gibi
    //davranirlar.
    //Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan gorulebilirler.
    protected int salary = 3000;

    //Note: Class'lar public ve default olabilir. Ama, privite ve protected olamazlar.




}
