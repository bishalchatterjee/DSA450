import java.util.Arrays;
import java.util.Scanner;

public class question108 {
    //Bisu and Shoulders Problem (HackerRank)
    static int upper_bound(int arr[],int key)//returns upperbound of a key (similar to upper_bound stl function in C++)
    {
        int upperBound = 0;

        for(int i=0;i< arr.length;i++) {
            // If current value is lesser than or equal to key
            if (arr[upperBound] <= key)
                upperBound++;
        }
       return upperBound;

    }

     static void findPowerOfBisu(int arr[],int n){

         Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
         System.out.println("Enter number of Powers Of Bishu ");
         int no_power= sc.nextInt();

         //creating a 1-indexed array sum array (sum of previous elements)
         int pre[]=new int[n+1];
         pre[0]=0;

         for(int i=1;i<=n;i++) //calculating and filling array with sum of previous consecutive elements of arr
             pre[i]=pre[i-1]+arr[i-1];

         System.out.println("Enter Powers Of Bishu ");
         for(int i=0;i<no_power;i++){
             int curr_power= sc.nextInt();
             int idx=upper_bound(arr,curr_power);
             System.out.println(idx + " " +pre[idx]);
         }

     }

    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7};
        int n=arr.length;
        Arrays.sort(arr);

        findPowerOfBisu(arr,n);

    }
}
