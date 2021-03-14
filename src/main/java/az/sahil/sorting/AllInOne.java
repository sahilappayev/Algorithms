package az.sahil.sorting;

public class AllInOne {

    public static void main(String[] args) {

        int[] arr = {2, 8, 3, 7, 15, 74, -8, 72, -15};

        for (int i : shellSorting(arr)) {
            System.out.println(i);
        }

    }

    /**
     * Bubble Sorting
     * In-place algorithm
     * Stable algorithm
     * O(n^2) time complexity
     */
    static int[] bubbleSorting(int[] arr) {
        for (int lstUnsrtIndex = arr.length - 1; lstUnsrtIndex > 0; lstUnsrtIndex--) {
            for (int i = 0; i < lstUnsrtIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Selection Sorting
     * In-place algorithm
     * Unstable algorithm
     * O(n^2) time complexity
     */
    static int[] selectionSorting(int[] arr) {
        for (int lstUnsrtIndex = arr.length - 1; lstUnsrtIndex > 0; lstUnsrtIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lstUnsrtIndex; i++) {
                if (arr[largestIndex] < arr[i]) {
                    largestIndex = i;
                }
                int temp = arr[i];
                arr[i] = arr[largestIndex];
                arr[largestIndex] = temp;
            }
        }
        return arr;
    }

    /**
     * Insertion Sorting
     * In-place algorithm
     * Stable algorithm
     * O(n^2) time complexity
     */
    static int[] insertionSorting(int[] arr) {
        for (int frstUnsrtIndex = 1; frstUnsrtIndex < arr.length; frstUnsrtIndex++) {
            int newElemnt = arr[frstUnsrtIndex];
            for (int i = frstUnsrtIndex; i > 0; i--) {
                if (arr[i - 1] > newElemnt) {
                    int temp = arr[i - 1];
                    arr[i - 1] = newElemnt;
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Shell Sorting
     * In-place algorithm
     * Unstable algorithm
     * O(n^2) time complexity (worst case)
     */
    static int[] shellSorting(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    int temp = arr[j - gap];
                    arr[j - gap] = newElement;
                    arr[j] = temp;
                    j = j - gap;
                }
            }
        }
        return arr;
    }
}
