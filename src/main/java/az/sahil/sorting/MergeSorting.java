package az.sahil.sorting;

import java.util.Arrays;

import static az.sahil.util.AlgorithmUtil.shift;

/**
 * Not an in-pace algorithm
 * Stable algorithm
 * O(nlogn) time complexity
 */
public class MergeSorting {

    public static void main(String[] args) {

        int[] arr = {5, -3, 22, 0, 17, -11};

        mergeSort(arr, 0, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // array ve arrayin bashlangic ve son deyerlerini qebul eden metod yaziriq
    // bu metod arrayi bashlangicdan ortasina ve ortadan sonuna iki hisse parchalayir
    static void mergeSort(int[] arr, int start, int end) {
        // eger son ile bashlangic arasindaki ferq 2 den kichikdirse metoddan chixiriq
        // tek elementli array parchasina chatmishiqdir ve tek elementli array sirali sayilir
        if (end - start < 2)
            return;
        // bashlangic ve son deyerlerinin riyazi ortasini tapiriq
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid); // sol array parchasi
        mergeSort(arr, mid, end); // sag array parchasi
        merge(arr, start, mid, end); // metodun sonunda birleshdirme aparilir

    }

    static void merge(int[] arr, int start, int mid, int end) {
        // birleshdirme prosesinde arrayin parchalarinin sirali oldugunu nezere alsaq
        // eger arrayin daxilindeki sol array parchasinin sonuncu elementi
        // sag array parchasinin birinci elementinden kichikdirse, her iki arrayin butun
        // elementleri sirali oldugu qebul edilir ve metoddan chixiriq
        if (arr[mid - 1] < arr[mid]) {
            return;
        }
        // birinci array parchasinin bashlangic deyeri
        int i = start;
        // ikinci array parchasinin bashlangic deyeri
        int j = mid;
        // muveqqeti arrayin bashlangic deyeri
        int k = 0;

        int[] temp = new int[start + end];

        while (i < mid && j < end) {
            // birinci array parchasi muqayise prosesinde esas goturulur
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i , arr, start + k, mid - i);
        System.arraycopy(temp, 0, arr, start, k);
    }

}
