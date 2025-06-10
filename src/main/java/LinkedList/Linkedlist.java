package LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(10);
        ll.add(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.add(50);
        ll.addLast(100);
       ll.reverse();
        ll.print();
    }

    Node head;

    void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
       // System.out.println("null");
    }

    void add(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
        }else {
            Node curr=head;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }
    void addFirst(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }
    void addLast(int e){
        Node temp=new Node(e);
        if(head==null){
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }
    void reverse(){
        if(head==null || head.next==null) return;
        Node curr=head;
        Node prev=null,temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }
}
