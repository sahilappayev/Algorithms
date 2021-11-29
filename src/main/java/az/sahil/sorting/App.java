package az.sahil.sorting;

import lombok.SneakyThrows;

public class App {
    @SneakyThrows
    public static void main(String[] args) {


        System.out.println(App.class.getClassLoader());
        System.out.println(String.class.getClassLoader());


    }


    public static void bubbleSorting(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSorting(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int largestElement = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[largestElement] < arr[j]) {
                    largestElement = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[largestElement];
            arr[largestElement] = temp;
        }
    }

    public static void insertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            for (int j = i; j > 0; j--) {
                if (newElement < arr[j]){
                    int temp = arr[j];
                    arr[j] = newElement;
                    arr[i] = temp;
                }
            }
        }
    }

}
