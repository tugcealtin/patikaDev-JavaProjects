import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int toplam ;
        do {
            toplam=0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayi= ");
            sayi = scan.nextInt();
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + i;
                }

            }if(sayi==toplam){
                System.out.println(sayi+" sayisi mukemmel sayidir");
            }else{
                System.out.println(sayi+" sayisi mukemmel degil");
            }
            System.out.println("Sorgu tekrar basliyor");
        } while (true);
    }
}
