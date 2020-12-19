package az.sahil.util;

public class AlgorithmUtil {


    // array`deki i ve j indeksli elementlerin yerini deyishir
    public static void shift(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
