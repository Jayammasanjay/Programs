package LinkedList;

public class rotateList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;
        Node newHead = rotate(head, k);
        printList(newHead);

    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node rotate(Node head,int k){
        int size=0;
        Node curr=head;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        curr.next=head;

        Node newTail=head;
        for(int i=1;i<size-k && curr!=null;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        newTail.next=null;
    return newHead;
    }
}
