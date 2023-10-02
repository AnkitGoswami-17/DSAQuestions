package LinkedList;
//https://leetcode.com/problems/merge-two-sorted-lists/description/
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode=new ListNode(Integer.MIN_VALUE);
        ListNode headNode=newNode;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                newNode.next=l1;
                l1=l1.next;
            }
            else{
                newNode.next=l2;
                l2=l2.next;
            }
            newNode=newNode.next;
        }
        if(l1==null){
            newNode.next=l2;
        }else if(l2==null){
            newNode.next=l1;
        }
        return headNode.next;
    }
}
