public class Main {

    static boolean isPalidrome(String word){

        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse=reverse+word.charAt(i);
        }
        return reverse.equals(word);

    }
    public static void main(String[] args) {
        System.out.println(isPalidrome("kavak"));
    }
}
