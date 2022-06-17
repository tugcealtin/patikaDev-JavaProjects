import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kacinci ayda dogdunuz(orn:4)= ");
        month = inp.nextInt();
        System.out.println("Dogum gununuz(orn:13)= ");
        day = inp.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Oglak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 2) {

            if (day >= 1 && day <= 28) {
                if (day <= 21) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balik");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 3) {

            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Balik");
                } else {
                    System.out.println("Burcunuz Koc");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 4) {

            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Koc");
                } else {
                    System.out.println("Burcunuz Boga");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 5) {

            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Boga");
                } else {
                    System.out.println("Burcunuz Ikizler");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 6) {

            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Ikizler");
                } else {
                    System.out.println("Burcunuz Yengec");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 7) {

            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yengec");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 8) {

            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Basak");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 9) {

            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Basak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 10) {

            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        } else if(month==12){

            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oglak");
                }
            } else {
                System.out.println("Gecersiz gun girdiniz");
            }
        }else{
            System.out.println("Gecersiz ay girdiniz");

        }
    }
}