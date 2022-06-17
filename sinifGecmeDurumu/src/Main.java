import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri tanımlayalım ve bunlara değer ataması isteyelim
        //diziler ve notları nı diziler ile oluşturalım
        String[] ders={"Turkce","Matematik","Muzik","Fen","Tarih"};
        double [] not=new double [5];// notlara atamayı konsoldan yapacağız
        //şimdi dersler değer ataması  yapıcaz dizilerdeki elemanları for ile döndürücez ve atama yapıcaz
        Scanner inp= new Scanner(System.in);
        double nottoplam=0;
        for (int i=0;i < not.length;i++){
            System.out.print(ders[i]+" dersinin notu= ");
            not[i]= inp.nextDouble();
            nottoplam= nottoplam+not[i];
        }
        double notOrtalama=(nottoplam/5);
        /*
        String sonDurum; // bunu if else alternatif olarak yazdım kısaca böylede yazabilirdik diye
        sonDurum=(notOrtalama<50)?"Sinifta kaldiniz":"Sinifi geçtiniz";
        System.out.println(sonDurum+" Not ortalamaniz= "+notOrtalama);*/
//if else ile nasıl olur onu yazalım
        if(notOrtalama<50){
            System.out.println("Sinifta kaldiniz. Not ortalamaniz= "+notOrtalama);
        }else {
            System.out.println("Sinifi gectiniz. Not ortalamaniz= "+notOrtalama);
        }
    }
}
