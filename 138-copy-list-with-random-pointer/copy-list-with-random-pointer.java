class Solution {
    public Node deepCopy ( Node head){
       Node t1 = head.next;
       Node h2 = new Node(head.val);
       Node t2 = h2;
       while(t1 != null){
        Node newnode = new Node(t1.val);
        t2.next = newnode;
        t1 = t1.next ;
        t2 = t2.next;
       }
        return h2;
    }
    public void mergell(Node head, Node h2){
    Node t1 = head;
    Node t2 = h2;
    Node dummy = new Node(-1);
    Node t = dummy;
    while (t1!= null && t2!= null){
        t.next = t1;
        t = t.next;
        t1 = t1.next;

        t.next = t2;
        t2 = t2.next;
        t= t.next;
    }
    
    }
 public void random (Node head, Node head2){
Node t1 = head;
Node t2 = head2;
while (t1 != null) {
t2 = t1.next;
if(t1.random!=null) t2.random = t1.random.next;
t1 = t1.next.next;
}
}

    public void breakConnection(Node head, Node h2){
        Node t1 = head;
        Node t2 = h2;
        while(t1 != null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1 ==null)break;
            t2.next = t1.next;
            t2 = t2.next;
        }
       
    }

    public Node copyRandomList( Node head) {
        if (head == null ) return null;
    // step 1 create a deep copy of given linked list
        Node h2 = deepCopy(head);

    // step 2 is to connect both the linked list one by one
        mergell( head, h2 );   

    // step 3 point all random of new copied according to the old one
         random(head, h2);

    // step 4 is that we need to break the connection between the original and deep copy 
     breakConnection(head,h2);
    return h2;
}
}
