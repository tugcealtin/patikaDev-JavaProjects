import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 9, 2, 1, 12, 4, 3, 9, 4, 12, 7};
        int[] dupcift = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(dupcift, list[i])) {
                        dupcift[startIndex++] = list[i];
                        break;
                    }

                }

            }
        }
        for (int value : dupcift) {
            if ((value != 0) && value % 2 != 1) {
                System.out.println(value);
            }
        }
    }

}

