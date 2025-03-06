package package2;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Problem_16 {
    static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    static Node findIntersection(Node head1, Node head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);

       
        while (len1 > len2) {
            head1 = head1.next;
            len1--;
        }
        while (len2 > len1) {
            head2 = head2.next;
            len2--;
        }

        
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1; 
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
       
        Node head1 = new Node(4);
        head1.next = new Node(5);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(8);
        head1.next.next.next.next.next = new Node(9);
        head1.next.next.next.next.next.next = new Node(11);
        head1.next.next.next.next.next.next.next = new Node(12);
        head1.next.next.next.next.next.next.next.next = new Node(13);

        
        Node head2 = head1.next.next; 

        Node intersection = findIntersection(head1, head2);
        if (intersection != null) 
        {
            System.out.println("Intersection point: " + intersection.data);
        } else 
        {
            System.out.println("No intersection found.");
        }
    }
}
