package code.sorting;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/10/18
 * <p>
 * Merge Sort
 */
public class Problem1 {

    public static void main(String[] args) {
        int[] input = new int[]{3, 4, 2, 5, 1};
        int[] helper = new int[input.length];

        mergesort(input, helper, 0, input.length - 1);
        Arrays.stream(input).forEach(System.out::println);
    }

    private static void mergesort(int[] input, int[] helper, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergesort(input, helper, low, mid);
            mergesort(input, helper, mid + 1, high);
            merge(input, helper, low, mid, high);
        }
    }

    private static void merge(int[] input, int[] helper, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = input[i];
        }

        int helperLeft = low;
        int helperRight = mid + 1;
        int current = low;

        while (helperLeft <= mid && helperRight <= high) {
            if (helper[helperLeft] >= helper[helperRight]) {
                input[current] = helper[helperLeft];
                helperLeft++;
            } else {
                input[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = mid - helperLeft;
        for (int j = 0; j <= remaining; j++) {
            input[current + j] = helper[helperLeft + j];
        }
    }
}
