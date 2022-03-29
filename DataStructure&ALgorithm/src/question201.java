public class question201 {
    //Check for BST
    static boolean isBST(Node node){
        if(node==null) return true;

        Node left_child=node.left;
        Node right_child=node.right;

        if(left_child!= null && left_child.key > node.key) return  false;
        if(right_child!= null && right_child.key < node.key) return  false;

        return isBST(left_child) && isBST(right_child);
    }

    public static void main(String[] args) {
        Node node=new Node(2);
        node.left=new Node(1);
        node.right=new Node(3);
        System.out.println(isBST(node));
    }
}


//T.C- O(N) // where, N is number of nodes in tree