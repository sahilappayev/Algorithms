package az.sahil.sorting;

import static az.sahil.util.AlgorithmUtil.shift;

/**
 * In-place algorithm
 * Unstable algorithm
 * O(n^2) time complexity (worst case)
 */
public class ShellSorting {

    public static void main(String[] args) {

        int[] arr = {5, -3, 22, 74, 0, 17, -11};

        // shell sorting with insertion sorting
        //arrayin uzunlugunun yarisi qeder interval teyin edilir
        //her dovrde interval 2-e bolunur, 1-e beraber olana qeder
        //intervallardan yaranan matrisde her sutundaki elementler yuxaridan ashagi oz aralarinda siralanir
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //intervalin deyerinden bashlayaraq arrayin sonuna kimi elementleri yoxlayiriq
            for (int i = gap; i < arr.length; i++) {
                //her dovrde intervalin deyerinden bashlayaq i indexsindeki deyeri yeni element kimi qebul edirik
                int newElement = arr[i];
                //intervalin deyerinden bashlayaraq her dovrde artan j deyisheni elan olunur
                //j-ci ve ondan intervalin deyeri qeder geride olan (j-gap) indexsindeki elementlerin deyerleri muqayise edilir
                //(j- gap) elementi boyuk olarsa yerdeyishme edilir ve j-nin deyeri bir interval geriye chekilir
                for (int j = i; j >= gap && arr[j - gap] > newElement; j -= gap) {
                    shift(arr, j - gap, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
