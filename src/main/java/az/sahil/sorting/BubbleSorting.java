package az.sahil.sorting;

import static az.sahil.util.AlgorithmUtil.shift;

/**
 * In-place algorithm
 * Stable algorithm
 * O(n^2) time complexity
 */
public class BubbleSorting {


    public static void main(String[] args) {

        int[] arr = {5, -3, 22, 0, 17, -11};

        //sonuncu siralanmamish elementin indeksinden bashlayiriq
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            //o-ci indeksden sonuncu siralanmamish elemente kimi yanashi elementleri yoxlayiriq
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    //her dovrde elementlerin yerini deyishirik
                    shift(arr, i, i + 1);
                }
            }

        }

        for (int j : arr) {
            System.out.println(j);
        }
    }


}
