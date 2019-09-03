package main.java.prep.udemy;

import java.util.Objects;

/**
 * @author sharifahmed
 * @since 1/12/19
 */
public class Nth {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

        System.out.println(nthFromLast(head, 1));// should return 1.
        System.out.println(nthFromLast(head, 5)); //should return 5.
        System.out.println(nthFromLast(head2, 2)); //should return 3.
        System.out.println(nthFromLast(head2, 4)); //should return 1.
        System.out.println(nthFromLast(head2, 5)); //should return null.
        System.out.println(nthFromLast(null, 1)); //should return null.
    }

    // Implement your function below.
    public static Node nthFromLast(Node head, int n) {
        if (Objects.isNull(head)) {
            return null;
        }

        Node pointer1 = head;
        Node pointer2 = head;

        for (int i = 0; i < n; i++) {
            if (Objects.isNull(pointer2)) {
                return null;
            }
            pointer2 = pointer2.child;
        }

        while (!Objects.isNull(pointer2)) {
            pointer1 = pointer1.child;
            pointer2 = pointer2.child;
        }

        return pointer1;
    }

    //  NOTE: Feel free to use the following function for testing.
    //  It converts the given linked list into an easy-to-read string format.
    //  Example: 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
    public static String linkedListToString(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(String.valueOf(current.value));
            sb.append(" -> ");
            current = current.child;
        }
        sb.append("(null)");
        return sb.toString();
    }
}
