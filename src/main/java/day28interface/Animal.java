package day28interface;

public interface Animal {

    void eat();
    void drink();

    //1)interface'lerdeki tum variable'lar otomatik olarak "final"dir
    //  Bu yuzden interface icindeki variable'i olusturdugunuzda mutlaka deger atamasi yapmalisiniz.
    //  Bilindigi gibi final variable'larin degeri degistirilemez.
    //2)interface'lerdeki tum variable'lar otomatik olarak(default) "public" dir.
    //3)2)interface'lerdeki tum variable'lar otomatik olarak(default) "static" dir
    int age = 4;

}
