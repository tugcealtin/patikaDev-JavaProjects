import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //önce değişkenleri tanımlayalım
        int r;
        double pi=3.14;
        double sonuc;
        Scanner input=new Scanner(System.in); //Scanner sınıfından nesne oluşturduk
        //konsoldan r değişkenine değer atanmasını isteyelim
        System.out.println("Dairenin yari capini giriniz");
        //girdiği değeri tanımladığımız r değişkenine atayalım
        r= input.nextInt();

        //şimdi kişiye dairenin cevresinimi yoksa alanınımı hesaplamak istiyodunuz diye soralım verdiği cevaba göre program o işlemi çalıştırsın
       //önce bir cevap değişkeni oluşturalım ve bu değişkene konsoldan girilen değeri atayalım
        String cevap;
        input = new Scanner(System.in);
        System.out.println("dairenin alanini hesaplamak icin alan, cevresini hesaplamak icin cevre yazınız.");
        cevap=input.nextLine();
        {
            if (cevap.equals("alan")) {
                sonuc = pi * r * r;
                System.out.println("sonucunuz= "+sonuc);

            } else if (cevap.equals("cevre")) {
                sonuc = 2 * pi * r;
                System.out.println("sonucunuz= "+sonuc);
            } else {
                System.out.println("gecerli bir cevap girmediniz");
            }

        }
    }
}
