class Node3{
    int data;
    Node3 next;
    Node3(int x){
        data=x;
        next=null;
    }
}

public class question128 {
    //detect loop in linked list
    //Used Floyd Cycle Detection
    //slow pointer, fast pointer approach

    static boolean isLoop(Node3 head)
    {   Node3 slow_p = head,fast_p = head;  // slow and fast pointers --> slow moves 1x speed & fast moves 2x speed

        while (fast_p!=null && fast_p.next!=null) {  // base case handeling
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) { //if they meet loop is found
                return true;
            }
        }
        return false;
    }
    //printing function
    public static void printlist(Node3 head){
        Node3 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    public static void main(String args[])
    {
        Node3 head=new Node3(15);
        head.next=new Node3(10);
        head.next.next=new Node3(12);
        head.next.next.next=new Node3(20);
        head.next.next.next.next=head.next;  //intentionally looping to test our function
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }
}
