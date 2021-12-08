package az.sahil.searching;

import java.util.Date;

/**
 * O(n) time complexity
 */
public class LinearSearch {


    public static void main(String[] args) {

        int[] arr = {0, 6, 77, 56, 94, 33, 74};

        System.out.println(new Date().getTime());
        System.out.println(linearSearch(arr, 74));
        System.out.println(new Date().getTime());
        System.out.println(recursiveLinearSearch(arr, 0, 74));
        System.out.println(new Date().getTime());

    }

    public static int linearSearch(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static int recursiveLinearSearch(int[] arr, int index, int value) {
        if (index > arr.length - 1) {
            return -1;
        } else if (arr[index] == value) {
            return index;
        } else {
            return recursiveLinearSearch(arr, index + 1, value);
        }


    }


}
