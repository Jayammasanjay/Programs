package LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(10);
        ll.add(20);
        ll.add(30);
       // ll.addFirst(30);
       // ll.addFirst(40);
        ll.add(50);
        ll.addLast(100);
        ll.InsterAtPosition(3,40);
        ll.deleteAtIndex(2);
      //  ll.deleteFisrt();
      //  System.out.println(ll.size());
      // ll.reverse();
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
        Node prev=null;
        while(curr!=null){
           Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }

    void InsterAtPosition(int index,int data){
        if(index==0){
            addFirst(data);
        }
        else {
            Node temp=new Node(data);
            int count=0;
            Node curr=head;
            while(count<index-1){
                curr=curr.next;
                count++;

            }
            temp.next=curr.next;
            curr.next=temp;
        }
    }
    int size(){
        int length=0;
        if(head==null){
            throw new RuntimeException("LinkedList is empty"+length);
        }

        Node curr=head;
        while(curr.next!=null){
            length++;
            curr=curr.next;
        }
        return length+1;
    }

    void deleteFisrt(){
        if (head==null){
            return;
        }
        Node temp=head.next;
        head=temp;
    }
    void deleteAtIndex(int index){
        Node curr=head;
        if(head==null){
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        if (curr.next == null) return;

        for(int i=0;i<index-1 && curr.next!=null;i++){
            if (curr == null || curr.next == null){
                return;
            }
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }
}
