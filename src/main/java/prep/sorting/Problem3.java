package main.java.prep.sorting;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/10/18
 * <p>
 * You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order
 */
public class Problem3 {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{5, 6, 7, 0, 0, 0, 0};

        merge(B, 3, A);

        Arrays.stream(B).forEach(System.out::println);
    }

    private static void merge(int[] a, int actualLen, int[] b) {
        int totalLen = a.length - 1;
        int lenB = b.length;

        int pointerA = actualLen - 1;
        int pointerB = lenB - 1;

        while (pointerA >= 0 && pointerB >= 0) {
            if (a[pointerA] > b[pointerB]) {
                a[totalLen--] = a[pointerA--];
            } else {
                a[totalLen--] = b[pointerB--];
            }
        }

        if (pointerA < 0) {
            while (pointerB >= 0) {
                a[totalLen--] = b[pointerB--];
            }

        } else if (pointerB < 0) {
            while (pointerA >= 0) {
                a[totalLen--] = a[pointerA--];
            }
        }
    }
}
