package az.sahil.ds.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class HackerRankStack {

    public static void main(String[] args) {

    }

    /**
     * Maximum Element
     * <a href="https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=true">https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=true</a>
     */
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new LinkedList<>();
        for (String op : operations) {
            switch (op) {
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int max = Integer.MIN_VALUE;
                    for (Integer i : stack) {
                        if (i > max)
                            max = i;
                    }
                    result.add(max);
                    break;
                default:
                    String[] s = op.split(" ");
                    int i = Integer.parseInt(s[1]);
                    stack.push(i);
            }
        }
        return result;
    }

    /**
     * Equal Stacks
     * <a href="https://www.hackerrank.com/challenges/equal-stacks/problem?isFullScreen=true">https://www.hackerrank.com/challenges/equal-stacks/problem?isFullScreen=true</a>
     */
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        for (int i = h1.size() - 1; i >= 0; i--) {
            if (s1.isEmpty())
                s1.push(h1.get(i));
            else {
                s1.push(h1.get(i) + s1.peek());
            }
        }

        for (int i = h2.size() - 1; i >= 0; i--) {
            if (s2.isEmpty())
                s2.push(h2.get(i));
            else {
                s2.push(h2.get(i) + s2.peek());
            }
        }

        for (int i = h3.size() - 1; i >= 0; i--) {
            if (s3.isEmpty())
                s3.push(h3.get(i));
            else {
                s3.push(h3.get(i) + s3.peek());
            }
        }

        while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            Integer i1 = s1.peek();
            Integer i2 = s2.peek();
            Integer i3 = s3.peek();

            if (i1.equals(i2) && i2.equals(i3))
                return i1;
            if (i1 > i2 || i1 > i3)
                s1.pop();
            if (i2 > i1 || i2 > i3)
                s2.pop();
            if (i3 > i1 || i3 > i2)
                s3.pop();
        }
        return 0;
    }


}
