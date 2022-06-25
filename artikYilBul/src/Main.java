import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        yil = scan.nextInt();
        if (yil % 4 == 0) {
            if ((yil % 100 == 0)) {
                if (yil % 400 == 0) {
                    System.out.println("artik yil");
                } else {
                    System.out.println("artik degil");
                }
            } else {
                System.out.println("artik yil");
            }
        } else {
            System.out.println("artik yil degil");
        }
    }
}
