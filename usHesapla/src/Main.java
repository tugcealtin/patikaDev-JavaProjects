import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban, us;
        int tabanSon = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban sayisi= ");
        taban = inp.nextInt();
        System.out.print("Us sayisi= ");
        us = inp.nextInt();
        for (int i = 1; i <= us; i++) {
            tabanSon = tabanSon * taban;
        }
        System.out.println(taban + " uzeri " + us+" sayisinin sonucu= " + tabanSon);
    }
}
