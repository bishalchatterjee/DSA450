class Node9{
    int key;
    Node9 left;
    Node9 right;
    Node9(int k){
        key=k;
        left=right=null;
    }
}

public class question164 {
    //Return Height of a tree
    static int heightOfTree(Node9 node)
    {
        if (node==null)
            return 0;
        else
            return Math.max(heightOfTree(node.left),heightOfTree(node.right))+1;
    }

    public static void main(String[] args) {
        Node9 root=new Node9(10);
        root.left=new Node9(20);
        root.right=new Node9(30);
        root.left.left=new Node9(40);
        root.left.right=new Node9(50);
        root.right.left=new Node9(60);
        root.right.right=new Node9(70);

        System.out.println(heightOfTree(root));
    }
}
