package solutions;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution obj = new Solution();
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        obj.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode firstListNode = l1;
        ListNode secondListNode = l2;
        ListNode sumNode = new ListNode(0);
        ListNode thisNode = head;
        while (firstListNode != null || secondListNode != null) {

            int nodeOne = firstListNode.val;
            int nodeTwo = secondListNode.val;
            int sum = nodeOne + nodeTwo;
            if (sum > 9) {
                thisNode.next = new ListNode(sum % 10);
                thisNode = thisNode.next;
            } else {
                thisNode.next = new ListNode(sum);
                thisNode = thisNode.next;
            }

            firstListNode = firstListNode.next;
            secondListNode = secondListNode.next;
        }

        return head.next;
    }
}
