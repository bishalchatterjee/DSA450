import java.util.ArrayList;
import java.util.Collections;

class Node10
{
    int key;
    Node10 left;
    Node10 right;
    Node10(int k){
        key=k;
        left=right=null;
    }
}

public class question207 {
    //Merge Two BST and Form new Balanced BST.
    //Hint-Inorder traversal of BST is always sorted from increasing to decreasing order

    static ArrayList<Integer>temp=new ArrayList<>(); //static temp arraylist to access it in inorder() function
    static ArrayList<Integer> inorder(Node10 root){
        if(root!=null){
            inorder(root.left);
            temp.add(root.key); //adding the key of root to the temp arraylist
            inorder(root.right);
        }
        return temp;

    }

    public static void main(String[] args) {
        Node10 root1=new Node10(100);
        root1.left=new Node10(50);
        root1.right=new Node10(300);
        root1.left.left=new Node10(20);
        root1.left.right=new Node10(70);

        Node10 root2=new Node10(80);
        root2.left=new Node10(40);
        root2.right=new Node10(120);

        inorder(root1);//first store the inorder traversal of root1(BST 1) elements in the temp arraylist
        ArrayList<Integer>a=inorder(root2) ;//then calling the inorder traversal of root2(BST 2) elements then concatenating it in temp arraylist with previous inorder of root1 already in the temp;

        Collections.sort(a); //sort the arraylist  // implement own merge sort algo into a function, if using STL is not allowed.
        System.out.println(a);//print the array list containing the inorder traversal of merged balance bst

    }
}


//T.C- O(n log n)

