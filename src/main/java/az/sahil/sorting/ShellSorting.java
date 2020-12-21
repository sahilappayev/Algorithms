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

        //arrayin uzunlugunun yarisi qeder interval teyin edilir
        //her dovrde interval 2-e bolunur, 1-e beraber olana qeder
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //intervalin deyerinden bashlayaraq arrayin sonuna kimi elementleri yoxlayir
            for (int i = gap; i < arr.length; i++) {
                //her dovrde i-ci element muveqqeti temp deyisheninde saxlayir
                int temp = arr[i];
                //intervalin deyerinden bashlayaraq her dovrde artan j deyisheni elan olunur
                //j deyisheni intervaldan boyuk beraber ve arreyin i-ci elementinden 1 interval evvelki indeksdeki
                //element boyuk oldugu shertinde elementler deyishdirilir ve j deyishenin deyeri 1 interval azaldilir
                //temp elelementini yoxlamaq uchun daha evvelki elementlere kechid edilir
                for (int j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    shift(arr, j - gap, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
