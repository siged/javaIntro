package solutions;

public class TwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode(0);
        ListNode firstListNode = l1;
        ListNode secondListNode = l2;
        ListNode curent = sumNode;
        int keep = 0;
        while (firstListNode != null || firstListNode != null) {
            int x = (firstListNode != null) ? firstListNode.val : 0;
            int y = (secondListNode != null) ? secondListNode.val : 0;
            int sum = keep + x + y;
            keep = sum / 10;
            curent.next = new ListNode(sum % 10);
            curent = curent.next;
            if (firstListNode != null) {
                firstListNode = firstListNode.next;
            }
            if (secondListNode != null) secondListNode = secondListNode.next;
        }
        if (keep > 0) {
            curent.next = new ListNode(keep);
        }
        return sumNode.next;
    }
}
