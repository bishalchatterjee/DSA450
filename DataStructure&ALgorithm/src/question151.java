public class question151 {
    //Theory question

    //Can we reverse a Linked list in less than O(n) time?

    /*
    Answer-->

     Singly Linked list--> (Not Possible)-->It is not possible to reverse a singly linked list in less than O(n) time.
                                             A simple singly linked list can only be reversed in O(n) time using
                                             1)Recursive Approach
                                             2)Iterative Approach

     Doubly Linked List--> (Possible in O(1))-->A doubly linked list with head and tail pointer can also be reversed
                                             in O(1) time by swapping head and tail pointers,but we would have to
                                             traverse the list in forward direction using prev pointer and reverse
                                             direction using next pointer which may not be considered valid.
     */
}
