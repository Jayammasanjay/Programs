package LinkedList;

public class OddEven {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = oddeven(head);
        printList(result);

    }
    public static Node oddeven(Node head){
        Node odd=head;
        Node even=head.next;
        Node NewEvenHead=even;

        while (even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;

        }
        odd.next=NewEvenHead;
        return head;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
