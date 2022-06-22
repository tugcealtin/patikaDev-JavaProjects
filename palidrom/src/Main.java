public class Main {
    //dönüş tipini string olarak verdim böylece return  string veri tipinde bir değer olacak
    static String palidrom(int sayi) {
        int geciciSayi = sayi;
        int donusenSayi = 0;
        int kalanRakam;
        while (geciciSayi != 0) {
            kalanRakam = geciciSayi % 10;
            donusenSayi = (donusenSayi * 10) + kalanRakam;
            geciciSayi = geciciSayi / 10;
        }
        if (donusenSayi == sayi)
            return sayi + " sayisi palidrom sayidir ";
        else
            return sayi + " sayisi palidrom sayi degildir";// çıktı: 145 sayisi palidrom sayi degildir oldu
    }

    public static void main(String[] args) {
        System.out.println(palidrom(145));
    }
}
