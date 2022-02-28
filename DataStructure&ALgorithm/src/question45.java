import java.util.PriorityQueue;

public class question45 {
    //Kth smallest element in a row-cpumn wise sorted matrix
    static int kthSmallest(int[][]mat,int n,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                pq.add(mat[i][j]);
            }

        }

        for(int i=0;i<k-1;i++)
        {
            pq.remove();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int N=4,K=7;

        int mat[][]={{10, 20, 30, 40},
                     {15, 25, 35, 45},
                     {24, 29, 37, 48},
                     {32, 33, 39, 50}};

        System.out.println(kthSmallest(mat,N,K));
    }
}
//T.C - O(K*Log(N))
//A.S - O(N)