import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {45, 56, 23, 12, 45, 56, 78, 89, 12, 23, 56};
        int[] frekans = new int[dizi.length];
        System.out.println(Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++)   //ilk olarak dizinin boyutu kadar bir frekans dizisi olusturduk ve tüm elemanlarını 1 yaptık
            frekans[i] = 1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {     //burdada oluşan frekans dizisini sayıların tekrar edis sayısına göre degistiriyoruz
                if ((i != j) && (dizi[i] == dizi[j])) {//tüm dizi dolasıyor ve aynı sayılar kackez varsa frekans dizindeki index sayısı artıyor
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {     //burdada dizide aynı olan sayıyı görünce o sayıyı 0 olarak değiştir diyoruz
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;    //böylece yeni oluşan dizide sayıdan bir tane olucak tekrar edilenler 0 olarak gözükücek
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            if (frekans[i] > 1) {       //olustrulan frekans dizisindeki i.sayi en az 2 olmalı
                if (dizi[i] != 0)       //ve en son oluşturulan dizideki i. sayı 0 olmamalı
                    System.out.println(dizi[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}
