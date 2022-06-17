import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //önce değişken tanımlayalım
        double kilo, boy;

        //Scanner ile konsoldan değişkenlere değer atayalım
        Scanner inp=new Scanner(System.in);
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz(orn:1.68)= ");
        boy=inp.nextDouble();
        inp= new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz= ");
        kilo=inp.nextDouble();
        double indeks= (kilo) / (boy * boy);
        System.out.println("Vucut kutle indeksiniz= "+String.format("%.2f",indeks));//virgülden sonra sadece iki basamak gözükmesi için yazdık
        //ek olarak kişinin vucut kitle indeksine göre hangi aralıkta olduğu bilgisini verelim
        // bunu if else ile yapalım
        if(indeks<=18.5){
            System.out.println("Vucut kitle indeksinize gore ZAYIF araligindasiniz");
        }else if(indeks<=24.9){
            System.out.println("Vucut kitle indeksinize gore NORMAL araligindasiniz");
        }else if(indeks<=29.9){
            System.out.println("Vucut kitle indeksinize gore KILOLU araligindasiniz");
        }else if(indeks<=34.9){
            System.out.println("Vucut kitle indeksinize gore OBEZ araligindasiniz");
        }else{
            System.out.println("Vucut kitle indeksinize gore ASIRI OBEZ araligindasiniz");
        }




    }
}
