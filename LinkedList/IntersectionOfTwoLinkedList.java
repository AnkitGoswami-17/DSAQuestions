package LinkedList;
//https://leetcode.com/problems/intersection-of-two-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode newNode1 = headA;
        ListNode newNode2 = headB;

        while(newNode1 != newNode2){
            //newNode1 = newNode1 == null ? headB : newNode1.next;
            //newNode2 = newNode2 == null ? headA : newNode2.next;

            if (newNode1 == null){
                newNode1 = headB;
            }
            else{
                newNode1 = newNode1.next;
            }
            if (newNode2 == null){
                newNode2 = headA;
            }
            else{
                newNode2 = newNode2.next;
            }

        }
        return newNode2;
    }
}
