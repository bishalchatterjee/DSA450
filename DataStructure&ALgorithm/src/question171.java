public class question171 {
    //Right View of a Binary Tree
    //Left View of a Tree
    /*
    //structure_class
   class Node
   {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
    }
    //
    static ArrayList<Integer> rightView(Node root)
    {
      ArrayList<Integer> result = new ArrayList<>();
      rightView(root, result, 0);  //pass the root with empty arraylist and with i(count) as 0
      return result;
    }

    static void rightView(Node root, ArrayList<Integer> view, int i) {

        if (root == null) {
            return;
        }

        if (view.size() == i) {//check if the size of the view arraylist is == i then add the node to the arraylist
            view.add(root.data);
        }

        rightView(root.right, view, i+1);  // pass the left child as root with the arraylist and count of present index+1
        rightView(root.left, view, i+1);// pass the right child as root with the arraylist and count of present index+1
    }
     */
}


//T.C- O(n)
//S.C- O(Height of the tree)
