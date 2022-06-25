import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas = 0, yolculuk = 0;
        double km = 0;
        double mesafePara = 0.10;
        boolean isSuccessAge = false, isSuccessKm = false, isSuccessWay = false;

        while (!isSuccessAge || !isSuccessKm || !isSuccessWay) {
            if (!isSuccessKm) {

                System.out.print("km=");
                Scanner inp = new Scanner(System.in);
                km = inp.nextInt();
                if (km > 0) {
                    isSuccessKm = true;//km>0 ise isSuccessKm true olucak ve diğer ifi okumaya devam edecek
                } else {
                    System.out.println("lutfen pozitif deger girin");
                    continue;//eğer km<0 ise;kodu başa sar tekrar oku konsolda tekrar km değişkenine değer iste dedik
                }//continue sayesinde istenen deger doğru girildiği taktirde diğer değeri istemesini sağladık
            }
            if (!isSuccessAge) {
                System.out.println("yas=");
                Scanner inp = new Scanner(System.in);
                yas = inp.nextInt();
                if (yas > 0) {
                    isSuccessAge = true;
                } else {
                    System.out.println("lutfen pozitif deger girin");
                    continue;
                }
            }
            if (!isSuccessWay) {
                System.out.println("yolculuk tipi: \n1. tek yon \n2. gidis-donus.");
                Scanner inp = new Scanner(System.in);
                yolculuk = inp.nextInt();
                if (yolculuk == 1 || yolculuk == 2) {
                    isSuccessWay = true;
                } else {
                    System.out.println("lutfen 1 veya 2 rakamini secin ");
                    continue;
                }
            }
        }//en son tüm iflerin içi true ya eşitlendiğinde while içindeki değişkenler false değer alacağı için while döngüsü bitecek
        double yolPara = (km * mesafePara);
        if (yas < 12) {
            yolPara = yolPara - (yolPara / 2);
        } else if (yas == 12 || yas < 24) {
            yolPara = yolPara - (yolPara * 0.10);

        } else if (yas > 65) {
            yolPara = yolPara - (yolPara * 0.30);

        }
        if (yolculuk == 2) {
            yolPara = yolPara *2;
            yolPara=yolPara-(yolPara*0.20);
        }
        System.out.println("Yolcunun " + km + "\b\bkmlik yol icin bilet fiyati:" + yolPara + "TL'dir");
    }    //km double değer oldugu için sayıyı kaçış operatoru ile ondalık sayıdan tam sayı gibi gösterdim.Onceki iki karakteri sil dedim
}

