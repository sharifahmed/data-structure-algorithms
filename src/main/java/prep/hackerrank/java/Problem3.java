package main.java.prep.hackerrank.java;

/**
 * @author sharifahmed
 * @since 8/6/19
 */
public class Problem3 {

    public static void main(String[] args) {
        int n = 3;

        if ((n & 1) != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 & n <=5) {
                System.out.println("Not Weird");
            } else if (n >= 6 & n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
