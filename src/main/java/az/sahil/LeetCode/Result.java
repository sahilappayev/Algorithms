package az.sahil.LeetCode;

import java.util.List;

public class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int solve(List<Integer> arr) {

        int max = Integer.MIN_VALUE;
        Integer temp = null;
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.size(); i++) {
            Integer value = arr.get(i);
            if (temp != null && value > temp) {
                left = leftM(arr, i, left);
                right = rightM(arr, i, right);
            } else {
                left = leftM(arr, i, null);
                right = rightM(arr, i, null);
            }

            int result = left * right;
            if (result > max) max = result;
            temp = value;

        }

        return max;
    }

    private static int leftM(List<Integer> arr, int index, Integer j2) {

        if (j2 != null) {
            for (int j = j2 - 1; j >= 0; j--) {
                if (arr.get(j) > arr.get(index)) {
                    return j + 1;
                }
            }
        } else {
            for (int j = index - 1; j >= 0; j--) {
                if (arr.get(j) > arr.get(index)) {
                    return j + 1;
                }
            }
        }
        return 0;
    }

    private static int rightM(List<Integer> arr, int index, Integer k2) {
        if (k2 != null) {
            for (int k = k2; k < arr.size(); k++) {
                if (arr.get(k) > arr.get(index)) {
                    return k + 1;
                }
            }
        } else {
            for (int k = index + 1; k < arr.size(); k++) {
                if (arr.get(k) > arr.get(index)) {
                    return k + 1;
                }
            }
        }
        return 0;
    }

}


