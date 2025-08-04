package LinkedList;

public class swapPairs {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        Node res=swap(head);

        while(res!=null){
            System.out.print(res.data+" ");
            res=res.next;
        }

    }

    public static Node swap(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node first=head;
        Node second=head.next;
        Node prev=null;

        while(first!=null && second!=null){
            Node third=second.next;
            first.next=third;
            second.next=first;

            if(prev!=null){
                prev.next=second;
            }else{
                head=second;
            }

            prev=first;
            first=third;
            if(third!=null){
                second=third.next;
            }else{
                second=null;
            }
        }
        return head;
    }
}
