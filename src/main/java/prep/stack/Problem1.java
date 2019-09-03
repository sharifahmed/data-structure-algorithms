package main.java.prep.stack;

/**
 * @author sharifahmed
 * @since 4/22/18
 *
 * Stack definition
 */
public class Problem1 {

    private static class Stack {

        private int MAX = 100;
        private int items[] = new int[MAX];
        private int top;

        Stack () {
            this.top = -1;
        }

        public boolean isEmpty() {
            return top < 0;
        }

        public boolean push (int value) {
            top++;
            if (top > MAX) {
                System.out.println("Stack Overflow");
                return false;
            }
            items[top] = value;
            return true;
        }

        public int pop() {
            if (top < 0) {
                System.out.println("No items found");
                return -1;
            }
            return items[top--];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
