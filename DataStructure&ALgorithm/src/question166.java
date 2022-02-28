class Node6{
    int key;
    Node6 left;
    Node6 right;
    Node6(int k){
        key=k;
        left=right=null;
    }
}
public class question166 {
    //Mirror of a tree
     static void inOrder(Node6 root)
    {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }
    static Node6 mirrorTree(Node6 root)
    {
        if (root == null)
            return null;

        Node6 left = mirrorTree(root.left);
        Node6 right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String args[]) {
        Node6 root1 = new Node6(5);
        root1.left = new Node6(3);
        root1.right = new Node6(6);
        root1.left.left = new Node6(2);
        root1.left.right = new Node6(4);
        System.out.println("Before Mirroring :");
        inOrder(root1);
        System.out.println();
        System.out.println("After Mirroring :");
        mirrorTree(root1);
        inOrder(root1);

    }
}

//T.C -O(n)

