package az.sahil.sorting;

import static az.sahil.util.AlgorithmUtil.shift;

/**
 * In-place algorithm
 * Unstable algorithm
 * O(n^2) time complexity
 */
public class SelectionSorting {

    public static void main(String[] args) {

        int[] arr = {5, -3, 22, 74, 0, 17, -11};

        //siralanmamish sonuncu elementin indeksinden bashlayiriq
        for (int lastUnsortedElement = arr.length - 1; lastUnsortedElement > 0;
             lastUnsortedElement--) {

            //bashlangicda siralanmamish hissedeki 0 indeksli elementi en boyuk element kimi qebul edirik
            int largestElementIndex = 0;

            //0 indeksdeki elementi siralanmamish hissedeki 1-ci ve yuxari indeksli elementlerle yoxlayiriq
            for (int i = 1; i <= lastUnsortedElement; i++) {
                //eger boyuk varsa en boyuk element kimi onu qebul edirik
                if (arr[largestElementIndex] < arr[i]) {
                    largestElementIndex = i;
                }
            }

            //butun elementleri yoxladiqdan sonra yerlerini deyishirik
            shift(arr, largestElementIndex, lastUnsortedElement);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
