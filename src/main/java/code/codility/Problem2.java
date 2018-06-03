package code.codility;

/**
 * @author sharifahmed
 * @since 5/14/18
 */
public class Problem2 {

    static class Solution {
        public int solution(int N) {
            String bin = Integer.toBinaryString(N);

            int counter = 0;
            int max = 0;
            int startIndex = 0;

            for (int i = 0, len = bin.length(); i < len; i++) {
                if (bin.charAt(i) == '1') {
                    counter++;

                    if (counter == 1) {
                        startIndex = i;
                    } else if (counter == 2) {
                        int noOfZeros = i - startIndex - 1;
                        if (noOfZeros > max) {
                            max = noOfZeros;
                        }
                        startIndex = i;
                        counter = 1;
                    }
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(1376796946));
    }
}
