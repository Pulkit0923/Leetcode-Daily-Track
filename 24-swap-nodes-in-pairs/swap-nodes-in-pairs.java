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
      ListNode a = new ListNode(-1);
      ListNode b = new ListNode(-1);
      ListNode ta = a;
      ListNode tb = b;
      ListNode t = head;
      int i =1;
      while(t!= null){
        if(i % 2!=0){
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
     
      b= b.next;
      tb.next = null;
      ta.next = null;
       a = a.next;
       
    ListNode t1 = a;
    ListNode t2 = b;
    ListNode dummy2 = new ListNode(-1);
    ListNode temp = dummy2;
    while(t1!=null && t2!=null){
    temp.next = t2;
    t2 = t2.next;
    temp = temp.next;

    temp.next = t1;
    t1 = t1.next;
    temp =temp.next;
    }
    if(t1 == null){
        temp.next = t2;
    }
    else temp.next = t1;

   
return dummy2.next;
    }
   
}