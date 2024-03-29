public class question38 {
    //Search an element in a matrix

    static boolean searchInMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false; //if matrix is empty return false

        int n=matrix.length; //get number of rows
        int m=matrix[0].length; //get number of column

        int low=0; //low pointing to start element index of the matrix
        int high =(n*m)-1; // high pointing to last element index of the matrix

        while(low<=high){ //simple binary search
            int mid=(low+(high-low)/2); //get mid
            if(matrix[mid/m][mid % m]==target){   //matrix[mid/m][mid % m] gives the index of row and column of the current mid
                return true; //if found return true
            }
            if(matrix[mid/m][mid % m]< target){ //if the element at corresponding index of mid is less than target increase the low pointer
                low=low+1;
            }else{
                high=high-1; //else increase the high pointer
            }
        }
        return false;  //return false if not found
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchInMatrix(matrix,target));
    }
}

//T.C-O(log mn)


/*
//BrutForce

static boolean searchInMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){ //row
            for(int j=0;j<matrix[i].length;j++){  //column
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }}

    //T.C - O(row*column)
 */