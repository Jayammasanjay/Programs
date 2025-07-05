package LinkedList;

public class palindrome_linkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

       Boolean result=isPalindrome(head);

        System.out.println("Is palindrome: " + result);

    }

        public static boolean isPalindrome(Node head) {
            Node slow = head, fast = head;

            // Step 1: Find the middle using slow and fast pointers
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            // Step 2: If odd number of nodes, skip the middle node
            if (fast != null) {
                slow = slow.next;
            }

            // Step 3: Reverse the second half of the list
            slow = reverseList(slow);

            // Step 4: Compare both halves
            fast = head;
            while (slow != null) {
                if (fast.data != slow.data) {
                    return false;
                }
                fast = fast.next;
                slow = slow.next;
            }

            return true;
        }

        private static Node reverseList(Node head) {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
    }


