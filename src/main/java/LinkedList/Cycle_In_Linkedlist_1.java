package LinkedList;

public class Cycle_In_Linkedlist_1 {
    public static void main(String[] args) {
        Node p=new Node(1);
        Node p1=new Node(2);
        Node p2=new Node(3);
        Node p3=new Node(4);
        Node p4=new Node(5);
        p.next=p1;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p1;
        System.out.println(Cycle_In_Linkedlist_1.findCycle(p));
    }

    public static boolean findCycle(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {return true;}
        }
        return false;
    }
}
