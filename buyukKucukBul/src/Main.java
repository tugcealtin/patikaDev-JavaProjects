import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sayi;
        int min = 0;
        int max = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Girilecek sayi adedi= ");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            inp = new Scanner(System.in);
            System.out.print(i + ". sayi= ");
            sayi = inp.nextInt();

            if (i == 1) {//döngü ilk çalıştığında girilen sayiyi min ve max a eşitledik. bu ife sadece başlangıcta giricek cunku her dongude i bir artıcak
                min = sayi;//örn ilk girilen sayı 12 olsun devamındada 10 6 15 sayıları gelicek olsun
                max = sayi;//suan min de max da 12

            } else {//döngü ikinciye çalıştı gelen sayımız artık 10
                if (sayi < min) {//10 < 12 ise bu çalışsın
                    min = sayi;//burası çalıştı ve artık min değerimiz 10 oldu döngü tekrar devam ettiğinde 6<10 olacağı için min 6 olucak ve böyle devam edicek
                } else if (sayi > max)//10>12 ise burası çalışacaktı
                    max = sayi;
            }


        }
        System.out.println("min deger= "+min+ "\nmax deger= "+max);

    }
}
