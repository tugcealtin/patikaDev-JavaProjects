public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sonuc = 0.0;
        for (int i : numbers) {
            sonuc += (1 / i);
        }
        double avarage = numbers.length / sonuc;
        System.out.println("ortalama: "+avarage);
    }
}
