package prep.hackerrank.interviewprep.sorting;

/**
 * @author sharifahmed
 * @since 9/4/19
 */
public class BubbleSort {

    public static void main(String[] args) {
        countSwaps(new int[]{1, 2, 3});
        countSwaps(new int[]{3, 2, 1});
    }

    static void countSwaps(int[] a) {
        int noOfSwaps = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    noOfSwaps++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Array is sorted in " + noOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
