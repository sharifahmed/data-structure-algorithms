package main.java.prep.udemy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sharifahmed
 * @since 1/1/19
 */
public class MF {

    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(mostFreqent(array1));
        System.out.println(mostFreqent(array2));
        System.out.println(mostFreqent(array3));
        System.out.println(mostFreqent(array4));
        System.out.println(mostFreqent(array5));
    }

    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
        if (givenArray.length == 0) {
            return null;
        }

        Integer maxItem = null;
        Integer maxValue = Integer.MIN_VALUE;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer value : givenArray) {
            if (countMap.get(value) == null) {
                countMap.put(value, 1);
            } else {
                int count = countMap.get(value);
                countMap.put(value, ++count);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxItem = entry.getKey();
            }
        }

        return maxItem;
    }
}
