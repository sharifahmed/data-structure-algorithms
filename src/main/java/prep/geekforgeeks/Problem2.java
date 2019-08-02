package main.java.prep.geekforgeeks;

import java.util.Stack;

/**
 * @author sharifahmed
 * @since 5/16/18
 *
 * Min Element from Stack in O(1)
 */
public class Problem2 {

    private static class MyStack {
        Stack<Integer> stack;
        int min;

        MyStack() {
            this.stack = new Stack<>();
            this.min = Integer.MAX_VALUE;
        }

        public MyStack push(int val) {
            if (stack.isEmpty()) {
                min = val;
                stack.push(val);
                return this;
            }

            if (val < min) {
                stack.push(2 * val - min);
                min = val;
            } else {
                stack.push(val);
            }

            return this;
        }

        public int pop() {
            if (stack.isEmpty()) {
                return -1;
            }

            int val = stack.pop();

            if (val < min) {
                min = (2 * min - val);
            }

            return val;
        }

        public int min() {
            return (stack.isEmpty() || min == Integer.MAX_VALUE) ? -1 : min;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(18).push(19).push(29).push(15).push(16);
        System.out.println(myStack.min());
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.min());
    }
}
