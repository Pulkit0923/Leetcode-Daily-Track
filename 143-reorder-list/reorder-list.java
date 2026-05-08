// class Solution {
//     public ListNode divide(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast.next != null && fast.next.next != null){
//         slow = slow.next;
//         fast = fast.next.next;
// '        }
// '        return slow;
//     }
//     public ListNode reverse(ListNode head){
//         ListNode c = head;
//         ListNode n = null;
//         ListNode p = null;
//         while (c!= null){
//             n = c.next;
//             c.next = p;
//             p=c;
//             c = n;
//         } 
//         return p;
//     }
//     public void reorderList(ListNode head) {
//     ListNode mid = divide(head);
//     ListNode oldhead = mid.next;
//     mid.next = null;
//     ListNode h2 = reverse(oldhead);
//     ListNode t1 = head;
//     ListNode t2 = h2;
//     ListNode dummy = new ListNode(-1);
//     ListNode temp = dummy;
//     while(t1 != null && t2 != null){
//         temp.next = t1;
//         t1 = t1.next;
//         temp = temp.next;

//         temp.next = t2;
//         t2 = t2.next;
//         temp = temp.next;
//     }  
//     if(t1 == null) temp.next = t2;
//     else temp.next = t1;  
//      head = dummy.next;
//     }
// }




class Solution {
    public ListNode divide(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode n = null;
        ListNode p = null;
        while (c!= null){
            n = c.next;
            c.next = p;
            p=c;
            c = n;
        } 
        return p;
    }
    public void reorderList(ListNode head) {
    ListNode mid = divide(head);
    ListNode oldhead = mid.next;
    mid.next = null;
    ListNode h2 = reverse(oldhead);
    ListNode t1 = head;
    ListNode t2 = h2;
    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;
    while(t1 != null && t2 != null){
        temp.next = t1;
        t1 = t1.next;
        temp = temp.next;

        temp.next = t2;
        t2 = t2.next;
        temp = temp.next;
    }  
    if(t1 == null) temp.next = t2;
    else temp.next = t1;  
     head = dummy.next;
    }
}