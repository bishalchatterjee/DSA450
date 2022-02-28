import java.util.LinkedList;
import java.util.Queue;

class Node7
{
    int key;
    Node7 left;
    Node7 right;
    Node7(int k){
        key=k;
        left=right=null;
    }
}
public class question162 {
    //Level order traversal of tree

    public static void printLevel(Node7 root){
        if(root==null)return;
        Queue<Node7> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node7 curr=q.poll();
                System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Node7 root=new Node7(10);
        root.left=new Node7(20);
        root.right=new Node7(30);
        root.left.left=new Node7(40);
        root.left.right=new Node7(50);
        root.right.left=new Node7(60);
        root.right.right=new Node7(70);

        printLevel(root);
    }
}
//T.C -O(n)  {one node has to go in queue exactly once and come out exactly once so time complexity is O(n) not O(n^2)}
/*
class Solution
{
    static Queue<Node> q = new ArrayDeque<Node>();

    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node)
    {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        q.offer(node);
        while(q.isEmpty()==false){
            Node root = q.poll();
            arr.add(root.data);
            if(root.left!=null)  q.offer(root.left);
            if(root.right!=null) q.offer(root.right);
        }
        return arr;

    }
}
 */
