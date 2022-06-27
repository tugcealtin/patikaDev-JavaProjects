import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lutfen sayiyi girin.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Girdiginiz sayi: "+number);
        System.out.print("Ciktisi : ");
        desen(number,number,number);

    }
    static void desen(int a,int b,int c)
    {
        if (a>0)
        {
            System.out.print(a+" ");
            a =a-5;
            c=a;
            desen(a,b,c);
        }
        else if(a <=0)
        {
            System.out.print(c +" ");
            c=c+5;
            if (b==c)
            {
                System.out.println(b);
            }
            else
            {
                desen(a,b,c);

            }
        }

    }
}
