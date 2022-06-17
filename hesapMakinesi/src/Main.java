import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Switch case kullanarak hesap makinesi programi yazacağız.
        //ilk olarak değişkenleri tanımlayalım
        int sayi1, sayi2, islem;
        //konsoldan sayi değişkenlerine değer atayalım
        Scanner inp = new Scanner(System.in);
        System.out.println(" 1. sayiyi giriniz");
        sayi1 = inp.nextInt();
        System.out.println("2. sayiyi giriniz");
        sayi2 = inp.nextInt();


        while (true) {// bir while döngüsü olusturduk böylece islem sırasını dogru girene kadar islem değişkenine deger ataması tekrarlanacak

            System.out.print("Lutfen yapmak istediginiz islemin sirasini yaziniz;\n1.TOPLAMA\n2.CIKARMA\n3.CARPMA\n4.BOLME \nSeciminiz = ");
            islem = inp.nextInt();
            if (islem < 1 || islem > 4) {//eger islem değişkeni bu özelliklere sahipse;
                System.out.println("Girdiginiz islem sirasi gecerli degildir.");
                continue;//continue anahtar kelimesi kodu baştan tekrar oku demektir kodu okumaya "Lütfen yapmak iste..." yazan kod satırıyla devam edecektir.
            }            //if koşulu false olana kadar islem değişkenine değer ataması devam eder

            //islem değişkenine atanan değer 1 ile 4 arasında oldugunda switch case çaşılmaya başlar
            switch (islem) {
                case 1:
                    System.out.println("Toplama islemi sonucunuz= " + (sayi1 + sayi2));
                    break;
                case 2:
                    System.out.println("Cıkarama islemi sonucunuz= " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.println("Carpma islemi sonucunuz= " + (sayi1 * sayi2));
                    break;
                case 4:
                    while (true) {//burdada aynı şekide bir döngü açtık böylece 2. sayı 0 sa 2. sayıya yeni değer ataması iste 0dan farklı olana kadar döngüye devam et
                        if (sayi2 == 0) {//eger 2. sayı 0 ise 2.sayıya tekrar değer ataması yap dedik
                            inp = new Scanner(System.in);
                            System.out.println("Bir sayinin 0 ile bolumu tanimsizdir Lutfen 2. sayiyi tekrar giriniz ");
                            sayi2 = inp.nextInt();//2. sayıya yeni değeri atadık
                            continue;//if koşulunu false olana kadar 2. sayıya değer atama işlemi devam eder
                        } else {
                            System.out.println("Bolme isleminizin sonucu= " + (sayi1 / sayi2));
                        }
                        break;// bölme işlemindeki while döngüsünü kır dedik
                    }

            }
            break;// ilk baştaki işlem için yazılan while döngüsünü kır dedik


        }//while döngüsünün süslü parantezi burda sonlanıyor. Tüm işlemler while döngüsü içinde oluşturuldu


    }
}
