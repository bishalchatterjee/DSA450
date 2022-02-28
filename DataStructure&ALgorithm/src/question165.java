public class question165 {
    //Diameter of a tree
    static int max = Integer.MIN_VALUE;
    static int getMaxLength(Node root){
        if(root==null){
            return 0;
        }
        else{
            int l = getMaxLength(root.left);
            int r = getMaxLength(root.right);
            if(l+r+1>max)
                max=l+r+1;
            return Math.max(l,r)+1;
        }
    }
    // Function to return the diameter of a Binary Tree.
    static int diameter(Node root) {
        // Your code here
        getMaxLength(root);
        return max;
    }

    public static void main(String[] args) {

        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);

        System.out.println(diameter(root1));
    }
}
