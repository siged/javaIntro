import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
/*        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));*/

        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));


        addTwoNumbers(l1, l2);

    }

    private static ArrayList getArrayListFromLinkedList(ListNode l1) {
        ListNode lastInsertedObj = null;

        List arrList = new ArrayList<Integer>();

        do {
            if (l1 != null) {
                lastInsertedObj = l1.next;
                if (lastInsertedObj != null) {
                    arrList.add(lastInsertedObj.val);
                }

                if (lastInsertedObj.next != null) {
                    l1.next = lastInsertedObj.next;
                } else {
                    break;
                }
            }
        } while (l1 != null);
        return (ArrayList) arrList;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> l1List = new ArrayList<Integer>();
        List<Integer> l2List = new ArrayList<Integer>();
        List<Integer> finalArray = new ArrayList<Integer>();

        l1List = getArrayListFromLinkedList(l1);
        l2List = getArrayListFromLinkedList(l2);

        if (l1List.size() == l2List.size()) {

            for (int i = 0; i < l1List.size(); i++) {
                char[] charArr = new char[2];
                int sum = l1List.get(i) + l2List.get(i);
                String strToInteger = Integer.toString(sum);
                charArr = strToInteger.toCharArray();

                if (charArr.length > 1) {
                    finalArray.add(sum + 1);
                } else {
                    finalArray.add(sum);
                }

            }
        }
            List<Integer> biggerList = new ArrayList();
            int smaller = 0;

            if (l1List.size() > l2List.size()) {
                biggerList = l1List;
                smaller = l2List.size();
            } else {
                biggerList = l2List;
                smaller = l1List.size();
            }

            boolean hasAdditionalInteger = false;
            for (int i = 0; i < biggerList.size(); i++) {

                if (i > smaller - 1 && hasAdditionalInteger == true) {
                    if ((biggerList.get(i) + 1) > 9) {
                        hasAdditionalInteger = true;
                        finalArray.add(0);
                        if ((biggerList.size() - 1) == i && hasAdditionalInteger == true) {
                            if ((biggerList.get(i) + 1) > 9) {
                                finalArray.add(0);
                            }
                            finalArray.add(1);
                        }
                        continue;
                    }
                } else if (i > smaller - 1 && hasAdditionalInteger == false) {
                    hasAdditionalInteger = false;
                    finalArray.add(biggerList.get(i));
                    continue;
                }
                char[] charArr = new char[2];
                int sum = Integer.valueOf(l1List.get(i)) + Integer.valueOf(l2List.get(i));
                String strToInteger = Integer.toString(sum);
                charArr = strToInteger.toCharArray();
                for (int j = 0; j < charArr.length; j++) {

                }


                if (hasAdditionalInteger == true && charArr.length == 1) {
                    finalArray.add(sum + 1);
                    if ((sum + 1) > 9) {
                        hasAdditionalInteger = true;
                        continue;
                    } else {
                        hasAdditionalInteger = false;
                        continue;
                    }
                }

                if (charArr.length > 1) {
                    if (hasAdditionalInteger == true) {
                        finalArray.add(Integer.valueOf(String.valueOf(charArr[1])) + 1);
                    } else {
                        finalArray.add(Integer.valueOf(String.valueOf(charArr[1])));
                    }
                    hasAdditionalInteger = true;
                } else {
                    finalArray.add(sum);
                    hasAdditionalInteger = false;
                }
            }

        ListNode head = new ListNode(0);
        ListNode result = head;
        for (int i = 0; i < finalArray.size(); i++) {
            result.next = new ListNode(finalArray.get(i));
            result = result.next;
            System.out.println(finalArray.get(i));
        }
        return head.next;
    }


    public static class ListNode {
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
}
