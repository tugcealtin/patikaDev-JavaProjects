import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //bu örneği dizi oluşturarak yapalım
        String[] urunIsmi = {"Cilek", "Kivi", "Muz", "Patates", "Patlican"};
        double[] urunPara = {5.50, 4.0, 3.0, 2.50, 1.0};
        System.out.println("Manavda bulunan urunlerimiz ve fiyat listesi asagidaki gibidir");
        for (int i = 0; i < urunIsmi.length; i++) {
            System.out.println(urunIsmi[i] + "=" + urunPara[i] + "TL");
        }
        //şimdi hangi üründen kaç kilogram istiyor bu değerleri atayalım
        System.out.println("*************************************");
        int [] urunKilo = new int[5];//önce urunkilo dizisi oluşturdukk değer atamasını konsoldan yapıcaz fakat kaçtane değer alacağını belirttik
        Scanner inp=new Scanner(System.in);//konsoldan alacağımız için Scanner sınıfından nesne oluştur dedik
        System.out.println("Hangi urunden kac kg istediginizi yaziniz");
        double toplamPara = 0;//for döngüsünde her ürünün kilosu tanımlandığında hesaplama yapsın ve toplam paraya eklesin diye for döngüsünden önce tanımladım
        for (int j=0; j<urunKilo.length;j++){
            System.out.print(urunIsmi[j]+"=");
            urunKilo[j]= inp.nextInt();
            toplamPara=toplamPara+(urunPara[j]*urunKilo[j]);
        }
        System.out.println("Toplam odemeniz gereken ucret= "+toplamPara);
    }

    }
