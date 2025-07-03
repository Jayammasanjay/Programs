package LinkedList;

public class mergeTwoSortedList {
    public static void main(String[] args) {
        // List 1: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // List 2: 2 -> 4 -> 6
        Node l2 = new Node(1);
        l2.next = new Node(2);
        l2.next.next = new Node(3);
        l2.next.next.next=new Node(6);

        Node mergedHead = merge(l1, l2);
        printList(mergedHead);

    }
    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static Node merge(Node l1,Node l2){
        if(l1==null || l2==null){
            return l1==null ? l2 : l1;
        }
        if(l1.data<=l2.data){
             l1.next=merge(l1.next,l2);
            return l1;
        }
        else {
             l2.next=merge(l1,l2.next);
             return l2;
        }
    }
}
