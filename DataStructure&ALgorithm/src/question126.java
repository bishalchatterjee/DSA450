class Node1{
    int data;
    Node1 next;
    Node1(int x){
        data=x;
        next=null;
    }
}
public class question126 {
    //To Reverse a Linked List (Both Iterative and recursive way)

    //Recursive Approach
    static Node1 recReverseLL(Node1 curr,Node1 prev){
        if(curr==null)return prev;
        Node1 next=curr.next;
        curr.next=prev;
        return recReverseLL(next,curr);
    }
    //Iterative Approach
    static Node1 itrativeReverseLL(Node1 head){
        Node1 curr=head;
        Node1 prev=null;
        while(curr!=null){
            Node1 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    //Print list elements
    static void printLinkedList(Node1 head){
        Node1 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
//driver function
    public static void main(String[] args) {
        Node1 head=new Node1(10);
        head.next=new Node1(20);
        head.next.next=new Node1(30);

//        System.out.println("Using Recursive Approach");
//        head=recReverseLL(head,null);
//        printLinkedList(head);
        System.out.println("Using Iterative Approach");
        head=itrativeReverseLL(head);
        printLinkedList(head);

    }
}
//T.C (Recursive Approach)- O(n)
//S.C (Recursive Approach)- O(n)

//T.C (Iterative Approach)- O(n)
//S.C (Iterative Approach)- O(1)

//Iterative approach is better
//Comment out one approach from driver function to use another