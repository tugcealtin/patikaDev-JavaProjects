import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kumeElemani;
        int grupSayisi;
        int kSon = 1;
        int gSon = 1;
        int sSon = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kumedeki eleman sayisi= ");
        kumeElemani = scan.nextInt();
        System.out.println("Kumede kac grup olmalı= ");
        grupSayisi = scan.nextInt();

        for (int k = 1; k <= kumeElemani; k++) {
            kSon = kSon * k;
        }
        for (int g = 1; g <= grupSayisi; g++) {
            gSon = gSon * g;
        }
        for (int s = 1; s <= (kumeElemani - grupSayisi); s++) {
            sSon = sSon * s;
        }
        int kombinasyon=kSon/(gSon*(sSon));
        System.out.println(kumeElemani+" elemanin bulundugu bir kumede "+grupSayisi+" tane grup "+kombinasyon+" farklı sekilde olusabilir");

    }
}
