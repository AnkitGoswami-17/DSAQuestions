package LinkedList;

//https://leetcode.com/problems/split-linked-list-in-parts/

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int partSize=getLength(head)/k;
        int extraNode=getLength(head)%k;
        ListNode curr=head;
        ListNode prev=null;

        for(int i=0;curr!=null && i<k;i++,extraNode--){
            ans[i]=curr;
            for(int j=0;j<partSize+(extraNode>0?1:0);j++){
                prev=curr;
                curr=curr.next;
            }
            if(prev!=null){
                prev.next=null;
            }
        }
        return ans;
    }
    public int getLength(ListNode head){
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
}
