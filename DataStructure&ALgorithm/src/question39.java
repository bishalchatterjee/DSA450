import java.util.ArrayList;
import java.util.Collections;

public class question39 {
    // Find median in a row wise sorted matrix

    static int medianOfMatrix(int matrix[][]) {

        int row= matrix.length;
        int column= matrix[0].length;
        ArrayList<Integer> al= new ArrayList<>();  // initialize an arrayList
        int median; //To store the median
        int mid;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                al.add(matrix[i][j]); //adding element at index of matrix[i][j] to the arrayList
            }
        }
        Collections.sort(al); //Sorting the arrayList
        int len=al.size(); //get arrayList length
        if(len%2==0){  //if length is even then there are two middle elements , we have to use the general formula for median in case of even
            mid=len/2;
            median=(al.get(mid-1)+al.get(mid))/2; //get the median
        }
        else{
            mid=len/2;  //for odd only one median it the element at the middle of the sorted arraylist
            median=al.get(mid);
        }
        return median; //return the median of the matrix
    }

    public static void main(String[] args) {
        int matrix[][]={{1, 3, 5},
                        {2, 6, 9},
                        {3, 6, 9}};

        System.out.println(medianOfMatrix(matrix));
    }
}

//T.C- O(m^2 * nlogn)
//S.C- O(mn)