package LinkedList;

public class mergeNodeINBetweenZeroes {
    public static void main(String[] args) {
        // Example: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        Node head = new Node(0);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(0);

        Node merged = merge(head);
        printList(merged);

    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node merge(Node head){
        Node node=head.next;
        Node curr=node;

        while (curr!=null){
            int sum=0;
            while (curr.data!=0){
                sum+= curr.data;
                curr=curr.next;
            }
            node.data=sum;
            curr=curr.next;
            node.next=curr;
            node=curr;
        }
        head=head.next;
        return head;
    }
}
