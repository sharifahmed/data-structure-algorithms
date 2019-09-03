package main.java.prep.udemy;

/**
 * @author sharifahmed
 * @since 1/12/19
 */
public class Node {

    int value;
    Node child;

    Node(int value, Node child) {
        this.value = value;
        this.child = child;
    }

    // The string representation of this node.
    // Will be used for testing.
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
