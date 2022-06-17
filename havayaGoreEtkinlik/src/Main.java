import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sıcaklık derecesine göre hangi etkinlik
        //kişicen havanın kaç derce olduğu bilsini istiycez ve scaklık değişkenine değeri atayacağız
        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Hava kac derece= ");
                sicaklik=inp.nextInt();


        if(sicaklik<5){
            System.out.println("Bu sicaklikta kayak yapabilirsiniz");
        }
        if(sicaklik>=5&&sicaklik<15){
            System.out.println("Bu sicaklikta sinemaya gidebilirsiniz");
        }
        if(sicaklik>=10&&sicaklik<25){
            System.out.println("Bu sicaklikta piknige gidebilirisiniz");
        }
        if(sicaklik>=25){
            System.out.println("Bu sicaklikta yuzmeye gidebilirisniz");
        }

    }




}
