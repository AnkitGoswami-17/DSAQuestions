package LinkedList;
//https://leetcode.com/problems/linked-list-cycle-ii/
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
     public ListNode detectCycle(ListNode head) {
         ListNode f = head;
         ListNode s = head;
         
        while (f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if (f == s){
                s=head;
                while( f != s){
                    s = s.next;
                    f = f.next;
                }
                return s;
            }
        }
        return null;
    }
