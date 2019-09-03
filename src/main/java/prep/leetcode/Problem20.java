package main.java.prep.leetcode;

import java.util.Stack;

/**
 * @author sharifahmed
 * @since 5/3/18
 */
public class Problem20 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char bracket = stack.pop();

                if (bracket == '(' && s.charAt(i) != ')') {
                    return false;
                } else if (bracket == '{' && s.charAt(i) != '}') {
                    return false;
                } else if (bracket == '[' && s.charAt(i) != ']') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
