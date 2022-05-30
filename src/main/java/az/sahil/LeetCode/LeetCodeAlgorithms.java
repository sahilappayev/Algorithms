package az.sahil.LeetCode;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCodeAlgorithms {

    @SneakyThrows
    public static void main(String[] args) {
        /**
         first:
         {
         System.out.println("First started");
         second:
         {
         System.out.println("Second started");
         third:
         {
         System.out.println("Third started");
         if (true) break second;
         System.out.println("Third completed");
         }
         System.out.println("Second completed");
         }
         System.out.println("First completed");
         }*/


//        int i = 100, j = 200 ;
//        while (++i < --j);
//        System.out.println("Midpoint is " + i +" , " + j);


//        System.out.println(new Date().getTime());
//        System.out.println(romanToInt("MMMXLV"));
//        System.out.println(new Date().getTime());
//        System.out.println(romanToInt2("MMMXLV"));
//        System.out.println(new Date().getTime());

        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));

    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static int getInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static int climbStairs(int n) {


        return 0;
    }


    public static int romanToInt2(String s) {
        int prev = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int current = getInt(s.charAt(i));
            if (current >= prev) {
                result += current;
            } else {
                result -= current;
            }
            prev = current;
        }
        return result;
    }


    public static int romanToInt(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        Map<String, String> hashMap2 = new HashMap<>();


        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        hashMap2.put("IV", "IIII");
        hashMap2.put("IX", "VIIII");
        hashMap2.put("XL", "XXXX");
        hashMap2.put("XC", "LXXXX");
        hashMap2.put("LC", "LXXXX");
        hashMap2.put("CD", "CCCC");
        hashMap2.put("CM", "DCCCC");


        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        Set<Map.Entry<String, String>> entries2 = hashMap2.entrySet();

        for (Map.Entry<String, String> e : entries2) {
            if (s.contains(e.getKey())) {
                s = s.replace(e.getKey(), e.getValue());
            }
        }
        int value = 0;
        for (char c : s.toCharArray()) {
            value = value + hashMap.get(c);
        }
        return value;
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return arr;
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            Integer temp = target - nums[i];
            if (map.get(temp) != null) {
                return new int[]{i, map.get(temp)};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int mod = x % 10;
            x = x / 10;
            result = result * 10 + mod;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int) result;

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int value = x;
        long result = 0;
        while (x != 0) {
            int mod = x % 10;
            x = x / 10;
            result = result * 10 + mod;
        }
        return value == result;
    }

    /**
     * Remove Duplicates from Sorted Array
     * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">https://leetcode.com/problems/remove-duplicates-from-sorted-array</a>
     */
    public static int removeDuplicates(int[] nums) {
        int count = nums.length > 0 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


    /**
     * Median of Two Sorted Arrays
     * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays">https://leetcode.com/problems/median-of-two-sorted-arrays</a>
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int firstLen = nums1.length;
        int secondLen = nums2.length;
        int[] mergeArr = new int[firstLen + secondLen];
        for (int i = 0; i < firstLen; i++)
            mergeArr[i] = nums1[i];
        for (int i = firstLen; i < mergeArr.length; i++)
            mergeArr[i] = nums2[i - firstLen];

        Arrays.sort(mergeArr);

        int sumLen = mergeArr.length - 1;
        int median = sumLen / 2;
        int modal = sumLen % 2;
        double result;
        if (modal == 0) {
            result = mergeArr[median];
        } else {
            result = ((double) mergeArr[median] + mergeArr[median + 1]) / 2;
        }
        return result;
    }

    /**
     * Container With Most Water (Medium)
     * <a href="https://leetcode.com/problems/container-with-most-water/">https://leetcode.com/problems/container-with-most-water/</a>
     */
    public static int maxArea(int[] height) {
        int maxValue = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int value = w * h;
                maxValue = Math.max(maxValue, (value));
            }
        }
        return maxValue;
    }

}
