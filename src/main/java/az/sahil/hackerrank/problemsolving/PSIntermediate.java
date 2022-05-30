package az.sahil.hackerrank.problemsolving;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem Solving (Intermediate)
 */
public class PSIntermediate {

    public static void main(String[] args) {

        List<String > list = new LinkedList<>();

    }

    /**
     * Array Manipulation
     * <a href="https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true">https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true</a>
     */
//    public static long arrayManipulation(int n, List<List<Integer>> queries) {
//        long[] arr = new long[n];
//
//        for (int j = 0; j < queries.size(); j++) {
//            for (int i = queries.get(j).get(0) - 1; i < queries.get(j).get(1); i++) {
//                arr[i] += queries.get(j).get(2);
//            }
//        }
//
//        long max = arr[0];
//        for (int i = 1; i < arr.length; i++)
//            if (max < arr[i]) max = arr[i];
//        return max;
//    }
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 1];
        int m = queries.size();

        while (m-- > 0) {
            arr[queries.get(m).get(0) - 1] += queries.get(m).get(2);
            arr[queries.get(m).get(1)] -= queries.get(m).get(2);
        }

        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = max > sum ? max : sum;
        }
        return max;
    }


}
