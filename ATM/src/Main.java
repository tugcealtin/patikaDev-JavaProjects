import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        int operations;
        int para;
        int bakiye = 500;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adi= ");
        username = inp.nextLine();
        System.out.print("Sifre= ");
        password = inp.nextLine();
        int i = 1;
        while (true) {
            inp = new Scanner(System.in);
            if (!username.equals("admin") && !password.equals("123")) {
                System.out.print("kullanici adini tekrar giriniz= ");
                username = inp.nextLine();
                System.out.print("sifreyi tekrar giriniz= ");
                password = inp.nextLine();
                i++;
                if (i > 5) {
                    System.out.println("5 kez yanlis giris yaptiniz hesap blokelendi");
                    break;
                } else continue;

            } else {
                System.out.println("Lutfen yapmak istedidiginiz islemin islem numarasini yaziniz(orn:1)\n1.Para cekme\n2.Para Yatırma\n3.Bakiye sorgulama\n");
                operations = inp.nextInt();
                while (true) {
                    if (operations != 1 && operations != 2 && operations != 3) {
                        inp = new Scanner(System.in);
                        System.out.println("Lutfen yapmak istedidiginiz islemin islem numarasini tekrar yaziniz(orn:1)\n1.Para cekme\n2.Para Yatırma\n3.Bakiye sorgulama\n");
                        operations = inp.nextInt();
                        //if (operations == 1 || operations == 2 || operations == 3) break;
                    }
                    switch (operations) {

                        case 1: {
                            inp = new Scanner(System.in);
                            System.out.print("Cekmek istediginiz tutar= ");
                            para = inp.nextInt();
                            if (para > bakiye) {
                                System.out.print("Bakiye yetersiz");
                            } else {
                                System.out.println("Hesabinizdan " + para + "TL cekilmistir. Kalan bakiye= " + (bakiye - para));
                            }
                            break;
                        }
                        case 2: {
                            inp = new Scanner(System.in);
                            System.out.print("Yatirmak istediginiz tutar= ");
                            para = inp.nextInt();
                            System.out.println("Hesabiniza " + para + "Tl para yatirilmistir. Guncel bakiye= " + (bakiye + para));
                            break;
                        }
                        case 3: {
                            System.out.println("Hesabinizdaki bakiye= " + bakiye);
                            break;
                        }

                    }
                    break;//işlemler için olan while döngüsünü kırıyor. 2. while için
                }

            }
            break;//ilk while döngüsünü kırıyor.

        }

    }
}
