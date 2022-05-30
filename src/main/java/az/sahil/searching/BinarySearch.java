package az.sahil.searching;

import java.util.Date;

/**
 * O(nlogn) time complexity
 */
public class BinarySearch {

    public static void main(String[] args) {

        int a = 5, b = 7, c = 8;

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
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == arr[mid]) return mid;
            if (value < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int low, int high, int value) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return recursiveBinarySearch(arr, low, mid - 1, value);
        } else {
            return recursiveBinarySearch(arr, mid + 1, high, value);
        }
    }

}
