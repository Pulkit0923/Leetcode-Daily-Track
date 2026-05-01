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
    public ListNode rotateRight(ListNode head, int k) {
      ListNode slow = head;
      ListNode fast = head;
      ListNode temp = head;
      if(head == null || head.next == null) return head; //{ if ll is 0 or has only 1      element if 0 then return head if ll has 1 element then if we rotate it it will be the same thats why return head}
      int n =0;
      while(temp != null){//  calculating length
        temp = temp.next;
        n++;
      }
       k = k%n;  // if k > n then this is done to get k as k<n
      if(k ==0) return head; // if there is no rotation to be performed then return head 

      for(int i =0;i<k;i++){// moving fast n steps ahead
        fast = fast.next;
      }
      while(fast.next!=null){// moving slow fast together as done in delete node algo
        slow = slow.next;
        fast= fast.next;
      }
    ListNode newHead = slow.next ;// making necessary changes
    fast.next = head;
    slow.next = null;
    return newHead;// returning the new formed head
    }
}