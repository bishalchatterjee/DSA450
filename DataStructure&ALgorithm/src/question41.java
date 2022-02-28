import java.util.Arrays;

public class question41 {
    //Print elements in sorted order using row-column wise sorted matrix
    static int[][] sortedMatrix(int N, int Mat[][]) {
        int[] arr = new int[N * N]; //create array of size row * column it N*N
        int index = 0; //index pointer
        for (int i = 0; i < N; i++) {  //row
            for (int j = 0; j < N; j++) { //column  //same as its a square matrix
                arr[index] = Mat[i][j]; //storing the element at Mat[i][j] in the array
                index++;  //incrementing index of array
            }
        }
        Arrays.sort(arr); //sorting the array
        index = 0; //re-initialize index of the array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = arr[index];  //updating the new matrix with the element at arr[index] from the sorted array
                index++; //incrementing index
            }
        }
        return Mat;  //return the updated matrix
    }

    public static void main(String[] args) {
        int Mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int N = 4;
        int res[][] = sortedMatrix(N, Mat); // getting the result matrix from the function call

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j]+" "); //printing the element with space
            }
            System.out.println(); //changing row line
        }
    }
}

//T.C-O(n^2 + nlogn)
//S.C- O(n^2)


