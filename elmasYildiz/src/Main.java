import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        /*
        1 4     *
        2 3    ***
        3 2   *****
        4 1  *******
        5 0 *********
        6 -1 *******
         */
        int diamondLayerCount;
        int starCount, spaceCount;
        while (true) {
            System.out.println("Lutfen elmas katini giriniz : ");
            diamondLayerCount = inp.nextInt();
            if (diamondLayerCount%2==0) {
                System.out.println("Cift sayi kabul edilemez!!!");
                continue;
            }

            for (int i = 1; i <= diamondLayerCount; i++) {
                starCount = i * 2 - 1;
                spaceCount = ((diamondLayerCount + 1) / 2) - i;
                if (starCount > diamondLayerCount) {
                    spaceCount = spaceCount * -1;
                    starCount = diamondLayerCount * 2 - starCount;
                }
                for (int j = 0; j < spaceCount + starCount; j++) {
                    if (j < spaceCount) {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}