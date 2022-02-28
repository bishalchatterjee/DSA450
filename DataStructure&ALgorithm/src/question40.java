public class question40 {
    //Find row with maximum no. of 1's

    /*Approach- 1)we start with two pointers i with value 0, j with value column-1
                2)Initialize answer as row with index -1 (if there are no rows with any 1)
                3)we run a while loop when i is >= 0 and i has to be < number of rows and j is >= 0 and j should be < than number of columns
                4)If the current element with index as matrix[i][j] ==1 then move from end to start direction in same row by decrementing j & we store the value of current row as it has 1's
                5)if the current element  with index as matrix[i][j] ==0 then we move to next row by incrementing i by 1
                6)while following the above steps we get index of the row with max 1's in ans variable    */
    static int rowWithMax1s(int matrix[][]) {

        int n= matrix.length; //row
        int m= matrix[0].length; //column
        int i=0;
        int j=m-1;
        int ans=-1;//stores the first row with max number of ones
        while(i>=0 && i<n && j>=0 && j<m)    //we traverse from the last element of present row check if it is 1 then we  store the index i in ans and reduce j
        {
            if(matrix[i][j] ==1){
                ans=i;
                j--;

            }//check for prev column of same row
            else if(matrix[i][j]==0 )  // if its 0 then we have to move to next row
                i++;//move to next row

        }
        return ans;
    }

    public static void main(String[] args) {
            int matrix[][]={{0, 1, 1, 1},
                            {0, 0, 1, 1},
                            {1, 1, 1, 1},
                            {0, 0, 0, 0}};

            System.out.println(rowWithMax1s(matrix));
        }
}


//T.C - O(N+M)
//S.C- O(1)

//Can also be done using binary search but this is efficient approach