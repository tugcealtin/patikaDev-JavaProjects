import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y;
        while (true) {
            while (true) {
                System.out.println("Lütfen satır ve sütun sayılarını sırasıyla giriniz ☺");
                Scanner scanner = new Scanner(System.in);
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x <= 0 || y <= 0) continue;
                break;
            }
            MineSweeper mineSweeper = new MineSweeper(x, y);
            mineSweeper.startGame();
            System.out.println("Tekrar oynamak için * giriniz ");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.nextLine().equals("*")) break;
        }
    }
}
