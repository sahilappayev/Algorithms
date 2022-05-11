package az.sahil.hackerrank.challenges;

import java.util.List;

public class OneWeekPreparationKit {

    public static void main(String[] args) {

        miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
    }


    /**
     * Mini-Max Sum
     * <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true">https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true</a>
     */
    public static void miniMaxSum(List<Integer> arr) {
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(maxIndex) < arr.get(i))
                maxIndex = i;
            else if (arr.get(minIndex) > arr.get(i))
                minIndex = i;
        }

        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < arr.size(); i++){
            if (i != minIndex)
                maxSum += arr.get(i);
            if (i != maxIndex)
                minSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

}
