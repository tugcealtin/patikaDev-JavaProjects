import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogunYili;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dogum yiliniz: ");
        dogunYili = scan.nextInt();
        switch (dogunYili % 12) {
            case 1:
                System.out.println("sonuc= Horoz");
                break;
            case 2:
                System.out.println("sonuc= Kopek");
                break;
            case 3:
                System.out.println("sonuc= Domuz");
                break;
            case 4:
                System.out.println("sonuc= Fare");
                break;
            case 5:
                System.out.println("sonuc= Okuz");
                break;
            case 6:
                System.out.println("sonuc= Kaplan");
                break;
            case 7:
                System.out.println("sonuc= Tavsan");
                break;
            case 8:
                System.out.println("sonuc= Ejderda");
                break;
            case 9:
                System.out.println("sonuc= Yilan");
                break;
            case 10:
                System.out.println("sonuc= At");
                break;
            case 11:
                System.out.println("sonuc= Koyun");
                break;
            case 0:
                System.out.println("sonuc= Maymun");
                break;

        }

    }
}