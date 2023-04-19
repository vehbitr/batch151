package day22stringbuilder;

public class Sbf01 {

    /*
        1)StringBuffer Java'da String ureten bir Class'dir
        2)StringBuffer, "StringBuilder" a cok benzer, yani ikiside "mutable" String uretir.
        3)StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" degildir.
        4)Java StringBuffer'i, StringBuilder'dan once olusturuldu.
        5)StringBuilder "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir.
        6)"multi-thread" yapilirken yapilan islerin sirasi onem arzeder, yapilan isleri
          mantikli bir siraya koymak "synchroonization" olarak adlandirilir
          StringBuffer "multi-thread" oldugu icin ayni zamanda "synchroonized" dir.

          Aciklama ==> manti'yi ocaga koyunca salata yapmaya baslariz once mantıyı ocaga koymak lazim cunku,
          once salatayi yapmaya baslarsak ocak bosta kalir ve zamandan kazanmis olmayiz bu yuzden StringBuffer gibi
          "multi-thread" yapilarda "synchroonization" yapmaliyiz yani duzgun bir siralama (senkronize bir sekilde)
          once manti'yi ocaga koy o piserken ayni esnada salatayi yap

         "multi-thread"==> ayni anda coklu is yapmak demektir. bu yuzden StringBuffer yavas calisir

        3 tane String olusturan Class ogrendik;
        1)immutable string lazimsa; String Class
        2)mutable string lazimsa; StringBuilder veya StringBuffer
                                  i)StringBuilder'i multi-thread gerekmezse kullaniriz
                                  ii)StringBuffer'i multi-thread gerekirse kullaniriz
     */

    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");

    }

}
