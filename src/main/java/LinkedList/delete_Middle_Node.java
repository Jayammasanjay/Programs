package LinkedList;

public class delete_Middle_Node {
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        mid(ll.head);
        ll.print();

    }

    public static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=head;
        if(head==null ||head.next==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}
