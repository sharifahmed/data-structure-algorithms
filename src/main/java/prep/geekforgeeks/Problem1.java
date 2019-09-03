package main.java.prep.geekforgeeks;

import java.util.Stack;

/**
 * @author sharifahmed
 * @since 5/16/18
 * <p>
 * Next larger element
 */
public class Problem1 {

    public static void main(String[] args) {
        int input[] = new int[]{4, 5, 2, 25};

        Stack<Integer> stack = new Stack<>();
        stack.push(input[0]);

        for (int i  = 1, len = input.length; i < len; i++) {
            int next = input[i];

            if (!stack.isEmpty()) {
                int currentElement = stack.pop();

                while (currentElement < next) {
                    System.out.println(currentElement + " -> " + next);

                    if (stack.isEmpty()) {
                        break;
                    }

                    currentElement = stack.pop();
                }

                if (next < currentElement) {
                    stack.push(currentElement);
                }
            }

            stack.push(next);
        }

        while (!stack.isEmpty()) {
            int currentElement = stack.pop();

            System.out.println(currentElement + " -> " + -1);
        }
    }
}
