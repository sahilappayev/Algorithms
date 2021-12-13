package az.sahil.sorting;

/**
 * In-place algorithm
 * Stable algorithm
 * O(n^2) time complexity
 */
public class InsertionSorting {

    public static void main(String[] args) {
        int[] arr = {5, -3, 22, 0, 17, -11};
        /*
        //birinci element siralanmish element kimi qebul edilir
        //ve ilk siralanmamish element kimi 1-ci indeksli elemetden bashlayiriq
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length;
             firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            //ilk siralanmamish elementle siralanmish elementleri muqayise edirik
            for (int i = firstUnsortedIndex; i > 0; i--) {
                if (arr[i - 1] > newElement) {
                    //her dovrde yerdeyishme edirlir
                    shift(arr, i, i - 1);
                }
            }
        }
        */
        insertionSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void insertionSort(int [] arr){
        for (int i = 1 ; i < arr.length; i++){
            int newElement = arr[i];
            for (int j = i; j > 0 ; j--){
                if (arr[j - 1] > newElement){
                    int temp = arr[j-1];
                    arr[j-1] = newElement;
                    arr[j] = temp;
                }
            }
        }
    }
}
