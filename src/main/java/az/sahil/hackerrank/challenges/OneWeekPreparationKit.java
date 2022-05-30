package az.sahil.hackerrank.challenges;

import java.text.DecimalFormat;
import java.util.List;

public class OneWeekPreparationKit {

    public static void main(String[] args) {

//        miniMaxSum(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
        System.out.println(timeConversion("04:59:59AM"));
    }

    /**
     * Plus Minus (Day 1)
     * <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true">https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true</a>
     */
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (Integer i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        int len = arr.size();

        double pRatio = (double) positive / len;
        double nRatio = (double) negative / len;
        double zRatio = (double) zero / len;

        System.out.println(new DecimalFormat("#.000000").format(pRatio) +
                "\n" + new DecimalFormat("#.000000").format(nRatio) +
                "\n" + new DecimalFormat("#.000000").format(zRatio));
    }

    /**
     * Mini-Max Sum (Day 1)
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

        for (int i = 0; i < arr.size(); i++) {
            if (i != minIndex)
                maxSum += arr.get(i);
            if (i != maxIndex)
                minSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

    /**
     * Time Conversion (Day 1)
     * <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?isFullScreen=true">https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?isFullScreen=true</a>
     */
    public static String timeConversion(String s) {
        String[] strings = s.split("[:]", 2);
        int hour = Integer.parseInt(strings[0]);

        if (s.endsWith("PM")) {
            if (hour != 12)
                hour += 12;
        } else if (s.endsWith("AM")) {
            hour = hour != 12 ? hour : 0;
        }
        String time = ":" + strings[1].substring(0, 5);
        if (hour < 10)
            time = "0" + hour + time;
        else
            time = hour + time;
        return time;
    }

}
