package code.leetcode;

/**
 * @author sharifahmed
 * @since 5/3/18
 */
public class Problem21 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1;

        while (l1.next != null) {
            l1 = l1.next;
        }

        l1.next = l2;

        mergeSort(head);

        return head;
    }

    private void mergeSort(ListNode head) {

    }
}
