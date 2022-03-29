
class Node12 {
    int key;
    Node12 left, right;

    public Node12(int item)
    {
        key = item;
        left = right = null;
    }
}
public class question197 {
    //Fina a value in a BST
    //can use  any traversal
    //currently using inorder traversal

    static void inorder(Node12 root, int key) {
        // Base Cases: root is null or key is present at root
        if (root != null) {
            inorder(root.left, key);
            if (root.key == key)
                System.out.print("True");
            inorder(root.right, key);
        }
    }

    public static void main(String args[])
    {
        int key=30;
        Node12 root=new Node12(10);
        root.left=new Node12(20);
        root.right=new Node12(30);
        root.right.left=new Node12(40);
        root.right.right=new Node12(50);


        inorder(root,key);
    }

}

//T.C-O(n)
//S.C-O(H)  //because of H+1 function calls in recursion call stack