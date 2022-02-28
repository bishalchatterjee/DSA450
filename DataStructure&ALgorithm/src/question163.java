import java.util.ArrayDeque;
import java.util.ArrayList;

class Node8{
    int key;
    Node8 left;
    Node8 right;
    Node8(int k){
        key=k;
        left=right=null;
    }
}
public class question163 {
    //Reverse Level Order Traversal of a Tree
    static ArrayList<Integer> reverseLevelOrder(Node8 node)
    {
        ArrayDeque<Node8> queue = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node8 curr = queue.poll();
            stack.push(curr.key);
            if (curr.right != null)
                queue.add(curr.right);
            if (curr.left != null)
                queue.add(curr.left);
        }
        return new ArrayList<>(stack);
    }

    public static void main(String[] args) {
        Node8 root=new Node8(10);
        root.left=new Node8(20);
        root.right=new Node8(30);
        root.left.left=new Node8(40);
        root.left.right=new Node8(50);
        root.right.left=new Node8(60);
        root.right.right=new Node8(70);

        System.out.println(reverseLevelOrder(root));

    }
}
