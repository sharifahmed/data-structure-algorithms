package main.java.prep.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharifahmed
 * @since 5/19/18
 */
public class Problem412 {

    static class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    result.add("Fizz");
                } else if (i % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fizzBuzz(15));
    }
}
