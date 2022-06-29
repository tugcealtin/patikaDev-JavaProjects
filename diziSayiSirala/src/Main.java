
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("dizinin boyutu: ");
        sayi = scan.nextInt();
        int[] dizi = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.print("dizinin " + (i + 1) + ". elemani: ");
            dizi[i] = scan.nextInt();
        }

        System.out.print("olusturulan dizi: ");
        for (int i : dizi) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < sayi; i++) {
            for (int j = i + 1; j < sayi; j++) {
                if (dizi[i] > dizi[j]) {
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }

            }
        }

        System.out.println();
        System.out.print("siralanmis dizi: ");
        for (int j : dizi) {
            System.out.print(j + " ");
        }

    }
}
