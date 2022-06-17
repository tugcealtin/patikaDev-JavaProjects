import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // not ortalamasını hesaplamak için önce değişken tanımlamalıyız
        int mat, kimya, fizik, tarih, turkce, muzik;

        //şimdi Scanner sınıfını tanımlayarak konsoldan değer alabiliriz ve tanımladığımız değişkenlere atayabiliriz
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değer alıp tanımladığımız değişkenlere atayalım

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat = inp.nextInt();  //mat değişkeni intager veri tipinde olduğu için nextInt dedik.

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Lütfen tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muzik = inp.nextInt();


        // tüm değişkenlere konsoldan değer ataması yapıldı değerler belleğe kaydedildi artık işlemleri yapabiliriz


        int toplam = (mat + kimya + fizik + tarih + turkce + muzik);
        double ortalama = toplam / 6; //ortalamanın sonucu ondalıklı bir sayı olabilir bu yüzden double tanımladık


        System.out.println(" Not ortalamanız: " + ortalama);

        //son olarak ortalama sonucuna göre sınıfta kalma ve sınıfı geçme koşulu yapalım

        boolean kosul = (ortalama > 60); //ortalama 60tan büyüktürün cevabı true mu false mu kosul değişkeni bize bunu vericek
        // boolean veri tipi bize true false değerini gösteriyordu biz kosul adında boolean veri tipinde bir değişken tanımladık

        String sonDurum = kosul ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";//sondurum değişkenin veri tipi koşulun cevapları metin şeklinde olduğu için stringtir.
        //burada sınıfı gectiniz ve kaldınız cevapları kosulun true false olmasına göre değişicek
        //true ise  ? işaretinden sonraki konsolda yazıcak false ise : işaretinden sonraki

        // konsolda cevabı görmek için System.out.println içinde sonDurum değişkenini çağırmamız gerek
        System.out.println(sonDurum);
    }
}