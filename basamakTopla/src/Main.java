import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,basamak;
        int toplam=0;
//konsoldan sayi değişkenine değer istedik
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        sayi= inp.nextInt();
        int tempsayi=sayi;//sayi değişkenini sonradan kullanıcaz o yüzden döngü için temp sayi değişkeni oluşturduk değişen temp sayi olsun diye
        while (tempsayi!=0){//sayi 0 oldugunda döngümüz durucak
            basamak=tempsayi%10;//sayının 10ile bölümünden kalan bizim basmaktaki sayımız
            //145/10 kalan 5 bu basamaktaki sayımız demek
            toplam=toplam+basamak;//basmaktaki sayıları topluyoruz
            tempsayi=tempsayi/10;//döngü bitmeden oncede syıyı 10 a bölüyoruz böylcee virgülden sonraki sayı gidiyo
            //145/10=14,5 yani 5 gidiyo geriye 14 kalıyo ve döngü böyle devam ediyo

        }

        System.out.println("Girdiginiz "+sayi+" sayisinin rakamlari toplami= "+toplam);
    }
}
