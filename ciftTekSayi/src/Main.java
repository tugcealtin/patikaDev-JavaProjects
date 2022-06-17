import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //konsoldan sayı girilmesini isteyelim ve verilen sayıya kadar olan çift sayıları görelim
        int sayi;
        double dordeBolunen = 0;
        double uceBolunen = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        sayi = inp.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {

                uceBolunen = uceBolunen + i;
            }
            if (i % 4 == 0) {
                dordeBolunen = dordeBolunen + i;
            }
        }
        double sonuc = (uceBolunen + dordeBolunen) / 2;
        System.out.println(sonuc);
    }
}
