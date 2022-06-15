package az.sahil.sorting;

/**
 * In-pace algorithm
 * Unstable algorithm
 * O(nlogn) time complexity (worst case n^2)
 */
public class QuickSorting {

    public static void main(String[] args) {
        int[] arr = {5, -3, 22, 0, 17, -11};

        quickSort(arr, 0, arr.length);

        for (int j : arr) {
            System.out.println(j);
        }
    }


    public static void quickSort(int[] input, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(input, start, end);
            quickSort(input, start, pivotIndex);
            quickSort(input, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] input, int start, int end) {
        // pivot element kimi ilk elementi sechirik
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }


}
