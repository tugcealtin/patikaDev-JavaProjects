import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        String bosluk = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("Hangi sayiya kadar olan asal sayıları gormek istersiniz? ");
        sayi = inp.nextInt();
        for (int i = 1; i <= sayi; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac++;
                }

            }
            if (sayac == 2) {
                bosluk = bosluk + i + " ";

            }
        }
        System.out.println(bosluk);

    }
}

