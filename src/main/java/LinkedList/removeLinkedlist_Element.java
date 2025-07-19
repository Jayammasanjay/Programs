package LinkedList;

import java.util.Scanner;

public class removeLinkedlist_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        System.out.println("enter the val");
        int val=sc.nextInt();
        Node temp=removeval(head,val);
        printlist(temp);



    }
    public static Node removeval(Node head,int val){
        if (head != null && head.data == val) {
            head = head.next;
            return head;
        }
        Node curr=head;
        while(curr.next!=null){
            if(curr.next.data==val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }

        }
        return head;
//        Node dummy=new Node(0);
//        dummy.next=head;
//        Node curr=dummy;
//        while(curr.next!=null){
//            if(curr.next.data==val){
//                curr.next=curr.next.next;
//            }else{
//                curr=curr.next;
//            }
//        }
//        return dummy.next;

    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
