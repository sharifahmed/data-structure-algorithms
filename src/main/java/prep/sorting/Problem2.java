package main.java.prep.sorting;

import java.util.Arrays;

/**
 * @author sharifahmed
 * @since 5/10/18
 * <p>
 * Quick Sort
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] input = new int[]{3, 4, 2, 5, 1};

        quicksort(input, 0, input.length - 1);
        Arrays.stream(input).forEach(System.out::println);
    }

    private static void quicksort(int[] input, int left, int right) {
        int index = partition(input, left, right);

        if (left < index - 1) {
            quicksort(input, left, index - 1);
        }

        if (right > index) {
            quicksort(input, index, right);
        }
    }

    private static int partition(int[] input, int left, int right) {
        int pivot = input[left + (right - left) / 2];

        while (left <= right) {
            while(input[left] > pivot) {
                left++;
            }

            while(input[right] < pivot) {
                right--;
            }

            if (left <= right) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;

                left++;
                right--;
            }
        }

        return left;
    }
}
