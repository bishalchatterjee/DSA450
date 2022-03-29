public class question199 {
    //Find min and max value in a BST
    /*
construct node class

 */
 /*
     //For finding min value (the left most leaf of the BST)
    int minValue(Node node)
    {
        if(node==null)
            return -1;
        while(node !=null && node.left!=null)
            node=node.left;
        return node.data;
    }

    //For finding max value (the right most leaf of the BST)
    int maxValue(Node node)
    {
        if(node==null)
            return -1;
        while(node !=null && node.right!=null)
            node=node.right;
        return node.data;
    }

  */
}


//T.C -O(H)
//S.C -O(H)

