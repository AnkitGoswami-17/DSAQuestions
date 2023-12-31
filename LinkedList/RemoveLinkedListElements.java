package LinkedList;
//https://leetcode.com/problems/remove-linked-list-elements/
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
    public ListNode removeElements(ListNode head, int val) {
       //  if(head==null){
       //     return head;
       // }
        ListNode newNode=new ListNode();
        newNode.next=head;
        ListNode curr=newNode;
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return newNode.next;
    }
}
