package LinkedList;
//https://leetcode.com/problems/swap-nodes-in-pairs/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode res = head.next;

        while (dummyNode.next.next != null){
            ListNode first = dummyNode.next;
            ListNode second = dummyNode.next.next;
            ListNode tail = dummyNode.next.next.next;

            dummyNode.next = second;
            second.next = first;
            first.next = tail;
            dummyNode = dummyNode.next.next;

            if (dummyNode == null || dummyNode.next == null){
                break;
            }
        }
        return res;
    }
}
