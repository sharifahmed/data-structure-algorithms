package main.java.prep.hackerrank.interviewprep.warmup;

/**
 * @author sharifahmed
 * @since 8/2/19
 */
public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(2, "DU"));
        System.out.println(countingValleys(8, "DDUUUUDD"));
        System.out.println(countingValleys(10, "UDDDUDUUDU"));
    }

    static int countingValleys(int n, String s) {
        int[] level = new int[n];
        int len = s.length();

        level[0] = s.charAt(0) == 'U' ? 1 : -1;

        int valleyCount = 0;
        boolean valleyStarted = s.charAt(0) == 'D';

        for (int i = 1; i < len; i++) {
            level[i] = s.charAt(i) == 'U' ? level[i - 1] + 1 : level[i - 1] - 1;

            if (level[i] == -1) {
                valleyStarted = true;
            } else if (valleyStarted && level[i] == 0) {
                valleyCount++;
                valleyStarted = false;
            }
        }

        return valleyCount;
    }
}
