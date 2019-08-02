package main.java.prep.stack;

import java.util.Stack;

/**
 * @author sharifahmed
 * @since 4/22/18
 *
 * Balancing Symbols
 */
public class Problem2 {

    private static boolean balanceChecker(String input) {
        Stack<Character> stack = new Stack<>();
        int inputLen = input.length();

        for (int index = 0; index < inputLen; index++) {
            Character currentElement = input.charAt(index);

            if (currentElement == '[' || currentElement == '{' || currentElement == '(') {
                stack.push(input.charAt(index));

            } else {
                Character topElement = stack.pop();

                if (topElement == '(' && currentElement != ')') {
                    return false;
                } else if (topElement == '[' && currentElement != ']') {
                    return false;
                } else if (topElement == '{' && currentElement != '}') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "[()]{}{[()()]()}";
        System.out.println(balanceChecker(input));
    }
}
