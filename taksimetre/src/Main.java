import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double acilisUcreti=10;
        double minimumUcret=20;
        double artis=2.20;
        double km;
        //km değişkenine değer atamadık scanner ile konsoldan isteyelim
        System.out.println("Yolcu kac km yol gitmistir");
        Scanner input= new Scanner(System.in);
        km=input.nextDouble();
        /*koşulda yazdıklarımız static olmamalı yani atanan değerleri yazmaktansa  değişken isimleri yazmalıyız
        Bu programda biz değerleri kendimiz atadık fakat bunları scanner ile konsoldanda isteyebilirdik
        bu yüzden değişkenlerin isimleri ile koşul oluşturduk. Böylece istediğimizde işlem basamaklarını değiştirmeden programı kolayca değiştirebiliriz */
        if ((acilisUcreti+(artis*km)<=minimumUcret)){
            System.out.println("Yolcunun odeyecegi tutar= "+ minimumUcret+"TL'dir");
        } else {
            acilisUcreti=acilisUcreti+(km*artis);
            System.out.println("Yolcunun odeyecegi tutar: "+ String.format("%.2f",acilisUcreti) + "TL'dir");
            } //acilisUcreti doubleveritipinde virgülden sonra kaç basamak gözüksün istiyorsak bunu düzenlemek için -String.format("%.kacbasamakgözüksünf",double değişkeninin ismi)

        }

    }

