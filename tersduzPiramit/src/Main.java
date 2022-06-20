import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, yapi, yildiz;
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Kac katli bir piramit olsun= ");
            sayi = inp.nextInt();
            System.out.print("\n1.Ters\n2.Duz\n-Piramiti hangi sekilde gormek istersiniz? ");
            yapi = inp.nextInt();
            switch (yapi) {
                case 1: {
                    //piramiti ters şekilde görmek istersek
                    for (int i = 0; i < sayi; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" ");
                        }
                        yildiz = (2 * sayi);
                        for (int k = 0; k < yildiz - (2 * i + 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    //piramiti düz şekilde görmek istersek
                    for (int i = 0; i < sayi; i++) {
                        for (int j = 0; j < sayi - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < (2 * i + 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                }
                default:
            }

            System.out.println("\nSoru tekrar sorulacaktır.\n------------------------------");
        }

    }
}