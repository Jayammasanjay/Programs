package LinkedList;

public class removeDuplicates2 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

       Node newhead=remove2(head);
       printList(newhead);

    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node remove2(Node head){
        Node temp=new Node(0);
        temp.next=head;
        
        Node curr=head;
        Node prev=temp;
        while(curr!=null){
            if(curr.next!=null && curr.data==curr.next.data){
                while(curr.next!=null && curr.data==curr.next.data){
                    curr=curr.next;
                }
                prev.next=curr.next;
            }else{
                prev=prev.next;
            }
            curr=curr.next;
        }
        return temp.next;
    }
}
