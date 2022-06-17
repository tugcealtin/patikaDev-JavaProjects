import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değiişkenler tanımlayalm ve değer ataması isteyelim
        int  a,b,c;
       Scanner inp=new Scanner(System.in);
        System.out.print("Lutfen 1. sayiyi giriniz= ");
        a=inp.nextInt();
        System.out.print("Lutfen 2. sayiyi giriniz= ");
        b=inp.nextInt();
        System.out.print("Lutfen 3. sayiyi giriniz= ");
        c=inp.nextInt();

        if((a>b)&&(a>c)){

            if(b>c){
                System.out.println("En buyuk sayi= "+a+" En kucuk sayi= "+c);
            }else{
                System.out.println("En buyuk sayi= "+a+" En kucuk sayi= "+b);
            }
        }else if((b>a)&&(b>c)){
            if(a>c){
                System.out.println("En buyuk sayi= "+b+" En kucuk sayi= "+c);
            }else {
                System.out.println("En buyuk sayi= "+b+" En kucuk sayi= "+a);
            }
        }else{
            if(b>a){
                System.out.println("En buyuk sayi= "+c+" En kucuk sayi= "+a);
            }else {
                System.out.println("En buyuk sayi= "+c+" En kucuk sayi= "+b);
            }
        }
    }
}
