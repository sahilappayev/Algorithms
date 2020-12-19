package az.sahil.sorting;

import static az.sahil.util.AlgorithmUtil.shift;

/**
 * In-place algorithm
 * Stable algorithm
 * O(n^2) time complexity
 */
public class InsertionSorting {

    public static void main(String[] args) {
        int[] arr = {5, -3, 22, 0, 17, -11};

        //birinci element siralanmish element kimi qebul edilir
        //ve ilk siralanmamish element kimi 1-ci indeksli elemetden bashlayir
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length;
             firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            //ilk siralanmamish elementle siralanmish elementi muqayise edir
            for (int i = firstUnsortedIndex; i > 0; i--) {
                if (arr[i - 1] > newElement) {
                    //her dovrde yerdeyishme edir
                    shift(arr, i, i - 1);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
