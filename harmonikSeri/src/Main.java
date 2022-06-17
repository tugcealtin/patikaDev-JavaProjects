import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("sayi= ");
        sayi=inp.nextInt();
        double sonuc=0;
        for (double i=1.0;i<=sayi;i++){
            sonuc=sonuc+(1/i);
        }
        System.out.println("Girilen sayinin harmonik seri sonucu= "+sonuc);
    }
}
