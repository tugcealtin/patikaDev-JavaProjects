import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2;
        int ebob = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz ");
        sayi1 = inp.nextInt();
        System.out.print("2.sayiyi giriniz ");
        sayi2 = inp.nextInt();
        int i = 1;
        while (i <= sayi1 && i <= sayi2) {
            if ((sayi1 % i) == 0 && (sayi2 % i) == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob= " + ebob);
        System.out.println("Ekok= " + (sayi1 * sayi2 / ebob));

    }
}
