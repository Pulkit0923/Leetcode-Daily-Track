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
    public ListNode oddEvenList(ListNode head) {
       ListNode a = new ListNode(-1);
       ListNode b = new ListNode(-2);
       ListNode ta = a;
       ListNode tb = b;
       ListNode t = head;
        int i = 1;
       while(t!=null){
        if(i%2 != 0){
        ta.next = t;
        ta = ta.next;
        t = t.next;
        }
        else{
        tb.next = t;
        tb = tb.next;
        t = t.next; 
        }
        i++;
       } 
       a = a.next;
       b = b.next;
       tb.next = null;
       ta.next = b;
       if(a == null){
        return b;
       }
       else return a;
    }
}