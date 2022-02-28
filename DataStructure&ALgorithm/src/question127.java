class Node2
{
    int data;
    Node2 next;
    Node2(int key)
    {
        data = key;
        next = null;
    }
}
public class question127 {
    //Reverse a Linked List in group of given size

    public static Node2 reverseLLByGivenSize(Node2 node, int k)
    {
        if(node==null || node.next == null) return node;  //base condition
        int c=0; //keeping count
        Node2 next;
        Node2 curr=node;
        Node2 prev=null;
        while(curr!=null && c<k){ //c must be less than given group size
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;   //incrementing c
        }
        node.next=reverseLLByGivenSize(curr,k);
        return prev;
    }
    //printing funtion
    static void printLinkedList(Node2 head){
        Node2 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node2 head=new Node2(1);
        head.next=new Node2(2);
        head.next.next=new Node2(3);
        head.next.next.next=new Node2(4);
        head.next.next.next.next=new Node2(5);
        head.next.next.next.next.next=new Node2(6);
        head.next.next.next.next.next.next=new Node2(7);
        head.next.next.next.next.next.next.next=new Node2(8);
        int k=4;//given group of size

        head=reverseLLByGivenSize(head,k);
        printLinkedList(head);

    }


}
