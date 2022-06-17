import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int ciftToplam = 0;
        int dordunkatlari = 0;

        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("sayi= ");
            sayi = inp.nextInt();
            if (sayi % 2 == 0) {
                ciftToplam = ciftToplam + sayi;
            }
            if (sayi % 4 == 0) {
                dordunkatlari = dordunkatlari + sayi;
            }

        }
        while (sayi % 2 == 0);
        System.out.println("Tek sayi girdiniz program durdu");
        System.out.println("Son toplam= "+(dordunkatlari+ciftToplam));
    }
}