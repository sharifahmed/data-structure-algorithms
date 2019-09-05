package prep.codewars;

import java.util.stream.IntStream;

/**
 * @author sharifahmed
 * @since 9/5/19
 */
public class SortTheOdd {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(sortArray(new int[]{5, 3, 2, 8, 1, 4}));
        intStream.forEach(System.out::println);
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) continue;
            for (int j = i + 1; j < array.length; j++) {
                if (isEven(array[j])) continue;
                swap(i, j, array);
            }
        }
        return array;
    }

    private static boolean isEven(int val) {
        return val % 2 == 0;
    }

    private static void swap(int i, int j, int[] array) {
        if (array[i] < array[j]) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
