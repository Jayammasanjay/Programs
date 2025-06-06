package LinkedList;

public class RemoveDuplicates extends Linkedlist{

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(10);
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        RemoveDuplicates.remove(ll);
        ll.print();


    }
   static void remove(Linkedlist ll){
        Node curr=ll.head;
        if(ll.head==null){
            return;
        }
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else {
                curr=curr.next;
            }
        }
    }
}
