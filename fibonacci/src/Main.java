import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleman ;
        Scanner scan=new Scanner(System.in);
        System.out.print("Seri kac sayidan olussun: ");
        eleman= scan.nextInt();
        int s1 = 0;
        int s2 = 1;
        int s3;
        System.out.print(s1+" ");
        System.out.print(s2+" ");
        for (int i = 2; i <= eleman; i++) {
            s3 = s1 + s2;
            System.out.print(s3+" ");
            s1 = s2;
            s2 = s3;
        }
    }
}
