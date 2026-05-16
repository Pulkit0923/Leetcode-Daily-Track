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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;
      ListNode a = head.next;
    ListNode newhead = reverse(a);
    a.next = head;
    head.next = null;
    return newhead;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ListNode temp = head;
          ListNode a = null;
           ListNode b= null;
            ListNode c = null;
             ListNode d = null;
           
        for(int i =1;temp!= null && i<=right+1;i++){
           
            if(i == left-1){
                a = temp;
            }
            if ( i == left) {
                 b = temp;
            }
            if (i == right) {
                c = temp;
            }
            if (i== right+1) {
               d = temp;
            }
            temp = temp.next;
        }
             
   if(a!= null) a.next = null;
   if(c!= null) c.next = null;
  

    ListNode newhead = reverse(b);
     if(a!= null) a.next = c; // either write c or newhead both same 
     b.next = d;
     if (a == null){
    return c;
     }
   else return head;
    }
}