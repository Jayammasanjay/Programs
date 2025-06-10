package LinkedList;

//142 question
public class Cycle_In_Linkedlist extends Linkedlist{
    public static void main(String[] args) {

        Node p=new Node(10);
        Node p1=new Node(20);
        Node p2=new Node(30);
        Node p3=new Node(40);
        Node p4=new Node(50);

        p.next=p1;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p2;

        System.out.println(Cycle_In_Linkedlist.cycle(p).data);

    }
    public static Node cycle(Node head){
        Node slow=head;
        Node fast=head;
        boolean isCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(!isCycle){
            return null;
        }
        slow=head;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
