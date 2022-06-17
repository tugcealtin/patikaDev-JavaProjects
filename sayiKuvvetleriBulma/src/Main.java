import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner inp =new Scanner(System.in);
        System.out.print("Sayi= ");
        sayi=inp.nextInt();
        System.out.println(sayi+" sayisindan kucuk 4'un kuvvetleri");
        for (int i=1;i<=sayi;i=i*4){
            System.out.println(i);
        }
        System.out.println(sayi+" sayisindan  kucuk 5'in kuvvetleri");
        for (int j=1;j<=sayi;j=j*5){
            System.out.println(j);
        }
    }
}
