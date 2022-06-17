import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcı girişi programı oluşturalım
        //değişkenleri tanımlayacağız fakat değerleri konsoldan alacağız
        String username, password;

        //konsoldan değer girilmesi için Scaner sınıfından nesne oluşturalım
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen kullanici adini giriniz= ");
        username = inp.nextLine();

        System.out.print("Lutfen sifreyi giriniz= ");
        password = inp.nextLine();

        //değer atamaları istedik şimdi eğer girdiği değerler yanlışsa ne yapacağız bu kodları yazalım
        //yapmamız gereken bu sorguyu while ile yapmak çünkü yanlış şifre veya kullanıcı adı girişinde değişkenlere tekrar değer atamasını yapmalı
        //bu döngüyü sınırlandıralım mesela 5 kez yanlış girdiğinde döngüden çıksın ve arka arkaya yanlis giriş yaptınız hesabınız blokelendi desin

        int i = 1;//i yi 1 den başlattım çünkü başta zaten bir kez  kullanıcı adı sifreyi sordu
        while (i < 5) {//döngümüzün kaç kez tekrar edebileceğini belirtttik her tekrarda içerideki i 1 artacak

            if (!username.equals("admin") || !password.equals("123")) {
                //koşulumuzu tanımladık String veri tipinde eşitlik karşılaştırmasında .equals kullanılır yazılanın tam tersi için başa ! işareti konur
                System.out.println("Kullanici adi veya sifreyi yanlis girdiniz lutfen bilgileri tekrar giriniz");
                inp = new Scanner(System.in);
                System.out.print("Kullanici adi= ");
                username = inp.nextLine();

                System.out.print("Sifre= ");
                password = inp.nextLine();
                i++;
                if (i == 5) {
            //döngünün tekrar etmesi için koşulumuzu i++ dan sonra tanımladık.  i artıktan sonra if okunacak uygunsa girecek uygun değilse girmeyecek,
                    System.out.println("arka arkaya yanlis giriş yaptınız hesabınız blokelendi");
                }
                continue;// ve continue ile döngü baştan devam edecek

            } else {// burdaki else süslü parantezlere dikkat edersen ilk if in else i
                System.out.println("Giris isleminiz basarilidir");//if e girmedi kulllanıcı adı ve sifre doğru ise çıktı bu olucak
            }
            break;// döngüyü kır dedik
        }
    }
}
