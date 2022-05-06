package az.sahil.hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PSBasic {

    public static void main(String[] args) {
//        SinglyLinkedListNode node1 = new SinglyLinkedListNode(383);
//        SinglyLinkedListNode node2 = new SinglyLinkedListNode(484);
//        SinglyLinkedListNode node3 = new SinglyLinkedListNode(392);
//        SinglyLinkedListNode node4 = new SinglyLinkedListNode(475);
//        SinglyLinkedListNode node5 = new SinglyLinkedListNode(321);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//        SinglyLinkedListNode result = insertNodeAtHead(node1, 5);
//
//        while (result.next != null){
//            System.out.println(result.data);
//            result = result.next;
//        }


        System.out.println(rotateLeft(4, Arrays.asList(1, 2, 3, 4, 5)));


    }

    /**
     * Arrays DS (Easy)
     * <a href="https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true">https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true</a>
     */
    static int[] reverseArray(int[] a) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[(a.length - 1) - i];
        }
        return newArr;
    }

    /**
     * 2D Array (Easy)
     * <a href="https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true">https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true</a>
     */
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int f = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int s = arr[i + 1][j + 1];
                int t = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max((f + s + t), max);
            }
        }
        return max;
    }

    /**
     * Dynamic Array (Easy)
     * <a href="https://www.hackerrank.com/challenges/dynamic-array/problem?isFullScreen=true">https://www.hackerrank.com/challenges/dynamic-array/problem?isFullScreen=true</a>
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int a = 0; a < n; a++) {
            arr.add(new ArrayList());
        }
        List<Integer> result = new ArrayList();
        int lastAnswer = 0;
        for (int i = 0; i < queries.size(); i++) {
            int a = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int idx = ((x ^ lastAnswer) % n);
            if (a == 1) {
                List<Integer> list = arr.get(idx);
                list.add(y);
                arr.set(idx, list);
            } else if (a == 2) {
                int value = (y % arr.get(idx).size());
                lastAnswer = arr.get(idx).get(value);
                result.add(lastAnswer);
            }
        }
        return result;
    }

    /**
     * Array Left Rotation (Easy)
     * <a href="https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true">https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true</a>
     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> list = new ArrayList<>(arr.size());
        for (int i = d; i < arr.size(); i++){
            list.add(arr.get(i));
        }
        for (int i = 0; i < d; i++){
            list.add(arr.get(i));
        }
        return list;
    }

    /**
     * Sparse Arrays (Medium)
     * <a href="https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true">https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true</a>
     */
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            result.add(0);
            for (String string : strings) {
                if (queries.get(i).equals(string)) {
                    result.set(i, result.get(i) + 1);
                }
            }
        }
        return result;
    }

    /**
     * Print the Elements of a Linked List (Easy)
     * <a href="https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true">https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true</a>
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    /**
     * Insert a node at the head of a linked list (Easy)
     * <a href="https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true">https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem?isFullScreen=true</a>
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode result = null;
        while (llist.next != null) {
            result = new SinglyLinkedListNode(llist.data);
            result.next = llist;
            llist = llist.next;
        }
        return result;
    }
}
