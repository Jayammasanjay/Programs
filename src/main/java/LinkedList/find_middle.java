package LinkedList;

public class find_middle extends Linkedlist{

        public static void main(String[] args) {
            Linkedlist ll=new Linkedlist();
            ll.add(10);
            ll.add(20);
            ll.add(30);
            ll.add(40);
            ll.add(50);
            ll.add(60);
            ll.add(70);
            find_middle.find(ll);

        }
        public static void find(Linkedlist ll){
            Node slow=ll.head;
            Node fast=ll.head;

            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            System.out.println(slow.data);
        }
    }


