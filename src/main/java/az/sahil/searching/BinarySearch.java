package az.sahil.searching;

import java.util.Date;

/**
 * O(nlogn) time complexity
 */
public class BinarySearch {

    public static void main(String[] args) {

        int a = 5, b =7 , c = 8;

        int[] arr = {1, 5, 9, 12, 65, 128, 129, 335, 345, 365};

        System.out.println(new Date().getTime());
        System.out.println(binarySearch(arr, 345));
        System.out.println(new Date().getTime());
        System.out.println(recursiveBinarySearch(arr, 0, arr.length, 345));
        System.out.println(new Date().getTime());

    }

    /**
     * Array must be sorted.
     * [p-----------q-----------r]
     */
    public static int binarySearch(int[] arr, int value) {
        int p = 0;
        int r = arr.length - 1;
        while (p <= r) {
            int q = (p + r) / 2;
            if (arr[q] == value) return q;
            if (arr[q] > value) r = q - 1;
            else p = q + 1;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int p, int r, int value) {
        if (p > r) {
            return -1;
        }
        int q = (p + r) / 2;
        if (arr[q] == value) {
            return q;
        } else if (arr[q] > value) {
            return recursiveBinarySearch(arr, p, q - 1, value);
        } else {
            return recursiveBinarySearch(arr, q + 1, r, value);
        }
    }

}
