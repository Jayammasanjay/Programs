package LinkedList;

public class sortList {
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        Node sorted = sortlist(head);
        printList(sorted);

    }

    public static Node sortlist(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node middle=Middle(head);
        Node left=head;
        Node right=middle.next;
        middle.next=null;

        left=sortlist(left);
        right=sortlist(right);

       return Merge(left,right);

    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static Node Middle(Node head){
        Node slow=head;
        Node fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static Node Merge(Node l1,Node l2){
        if(l1==null || l2==null){
            return l1==null ? l2 : l1;
        }
        if(l1.data<=l2.data){
            l1.next=Merge(l1.next,l2);
            return l1;
        }else{
            l2.next=Merge(l1,l2.next);
            return l2;
        }
    }
}
