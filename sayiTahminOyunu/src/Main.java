import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rdm = new Random();
        int secretNumber = rdm.nextInt(100);  //gelecek sayının int olarak gelmesini sağladık
        System.out.println("Oyunun kuralları: \n** 5 yanlış tahmin hakkınız vardır\n** Tahmin ettiğiniz sayı 0 ile 100 arasındadır ");
        Scanner inp = new Scanner(System.in);
        boolean isWin = false;
        int wrongAnswerPoint = 0;
        List<Integer> answers = new ArrayList<>();
        while (!isWin) {
            System.out.print("Tahmin ettiğiniz sayı: ");
            int inputNumber = inp.nextInt();
            answers.add(inputNumber);
            wrongAnswerPoint++;
            if (wrongAnswerPoint == 5) {
                System.out.println("Hakkınız kalmadı!" + "\n" + answers+ "\nGizli sayı= "+secretNumber);
                break;
            } else if (inputNumber < 0 || inputNumber > 100) {
                System.out.println("Kuralları tekrar okuyun, kalan hakkınız= " + (5 - wrongAnswerPoint));
            } else if (inputNumber > secretNumber) {
                System.out.println(inputNumber + " sayısı gizli sayıdan büyüktür, kalan hakkınız= " + (5 - wrongAnswerPoint));
            } else if (inputNumber < secretNumber) {
                System.out.println(inputNumber + " sayısı gizli sayıdan küçüktür, kalan hakkınız= " + (5 - wrongAnswerPoint));
            } else {
                System.out.println("**********Tebrikler kazandınız**********");
                System.out.println("Girilen sayılar= "+answers);
                isWin = true;
            }


        }


    }
}

