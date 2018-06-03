package code.stack;

import java.util.Stack;

/**
 * @author sharifahmed
 * @since 4/22/18
 *
 * Build Queue using 2 Stacks
 */
public class Problem3 {

    private static class Queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void enQueue(int item) {
            stack1.push(item);
        }

        public int deQueue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    int item = stack1.pop();
                    stack2.push(item);
                }
            }

            return (stack1.isEmpty() && stack2.isEmpty()) ? -1 : stack2.pop();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.deQueue());

        queue.enQueue(4);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
