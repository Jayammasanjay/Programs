package LinkedList;

public class reverseLinkedList2 {
    public static void main(String[] args) {

    }

    public static Node reverse2(Node head,int left,int right){
        if(head==null || head.next==null || left==right){
            return head;
        }
        Node prev=null;
        Node curr=head;
        int i=1;
        while(curr!=null && i!=left){
            prev=curr;
            curr=curr.next;
            i++;
        }
        Node pointerToStart=prev;
        Node start=curr;
        prev=null;

        while(curr!=null && i!=right+1){
            Node temp=curr;
            curr=curr.next;
            temp.next=prev;
            prev=temp;
            i++;
        }
        start.next=curr;
        if(pointerToStart!=null){
            pointerToStart.next=prev;
        }else {
            return prev;
        }

        return head;
    }
}
