package LinkedList;

public class AddTwoList {

    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // Second number: 465 (represented as 5 -> 6 -> 4)
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4); // represents 465

        Node result = add(l1, l2); // expected: 7 -> 0 -> 8 (807)
        printList(result);


    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node add(Node l1,Node l2){
        Node dummy=new Node(-1);
        Node curr=dummy;
        int carry=0;

        while (l1!=null || l2!=null){
            int sum=carry;

            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }

            if(l2!=null){
                sum+= l2.data;;
                l2=l2.next;
            }

            carry=sum/10;
            sum=sum%10;
            curr.next=new Node(sum);
            curr=curr.next;
        }
        if(carry > 0){
            curr.next = new Node(carry);
        }

        return dummy.next;
    }
}
