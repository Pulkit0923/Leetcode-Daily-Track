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
    public ListNode partition(ListNode head, int x) {
       ListNode a = new ListNode(100);
       ListNode b = new ListNode(200);
       ListNode ta = a;
       ListNode tb = b;
       ListNode t = head;
       while(t!= null){
        if(t.val < x ){
            ta.next =t;
            t = t.next;
            ta = ta.next;
        }
        else {
            tb.next = t;
            tb = tb.next;
            t= t.next;
        }

       }
       b = b.next;
       tb.next = null;
       ta.next = b;
        a = a.next;
      
      if(a == null) return b;
       else return a;
    }
}