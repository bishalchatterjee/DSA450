class Node4{
    int data;
    Node4 next;
    Node4(int x){
        data=x;
        next=null;
    }
}

public class question130 {

    static int startOfLoop(Node4 head)
    {   Node4 slow_p = head,fast_p = head;
        while (fast_p!=null && fast_p.next!=null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                break;
            }
        }
        return slow_p.data;
    }
    public static void main(String args[])
    {
        Node4 head=new Node4(1);
        head.next=new Node4(2);
        head.next.next=new Node4(3);
        head.next.next.next=new Node4(4);
        head.next.next.next.next=new Node4(5);
        head.next.next.next.next.next=head.next;
        startOfLoop(head);
        System.out.println(head.next.data);
    }
}
