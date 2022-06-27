import java.util.Scanner;

public class Main {
    static void toplama() {
        Scanner scan = new Scanner(System.in);
        int number;
        int result = 0;
        int i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
    }

    static void cikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        int number;
        int result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc : " + result);

    }

    static void carpma() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("0 rakami girildiginde isleminiz sonlanir. Eger 0 rakami isleme dahil ise sonuc 0 dir.Uyariyi dikkate aliniz!!!");
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuc : " + result);
    }

    static void usHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
    }

    static void faktoriyal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }

    static void modAl() {
        int number;
        int mod;
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak sayi: ");
        number = scan.nextInt();
        System.out.print(number + " % ");
        mod = scan.nextInt();
        System.out.println("Sonuc= " + number % mod);
    }

    static void dikdortgenAlanCevre() {
        int n1;
        int n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Degerler cm uzerinden hesaplanaciktir bu yuzden uzunlugu cm cinsinden giriniz!");
        System.out.print("Kisa kenar: ");
        n1 = scan.nextInt();
        System.out.print("Uzun kenar: ");
        n2 = scan.nextInt();
        System.out.println("Dikdortgenin alani: " + (n1 * n2) + " cm" + "\nDikdortgenin cevresi: " + (2 * (n1 + n2)) + " cm");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İslemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme  Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabı\n"
                + "0- Cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usHesapla();
                    break;
                case 6:
                    faktoriyal();
                    break;
                case 7:
                    modAl();
                    break;
                case 8:
                    dikdortgenAlanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
            if (select != 0)
                System.out.println("----------------\nTekrar islem yapabilirsiniz");
        } while (select != 0);


    }
}


