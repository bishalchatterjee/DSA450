import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class question247 {
    //CHOCOLA Chocolate (SPOJ)
    //Minimum cost to cut the boards into a square(GFG)
//    public static void reverse(int[] array) { (Not required if we call Collections.reverseOrder(
//        int n = array.length;
//        for (int i = 0; i < n / 2; i++) {
//            int temp = array[i];
//            array[i] = array[n - i - 1];
//            array[n - i - 1] = temp;
//        }
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); //no of test cases
        System.out.println();
        while(t>0){
            int m ,n;
            m=sc.nextInt();n=sc.nextInt();//respective lengths
            System.out.println();
            m--; //since there will be 1less than given m,n divisions horizontally and vertically
            n--;
            Integer x[]=new Integer[m]; //Important to declare as Integer and not int as int is not an object we can't use Collections.reverseOrder() to reverse the array as it requires object and int is not an object, SO ->  Integer arr= new Integer[len]; Otherwise we need to write code for reversing an array.
            Integer y[]=new Integer[n];
            for (int i= 0; i < m ; i++) x[i]=sc.nextInt();
            for (int j= 0; j < n ; j++) y[j]=sc.nextInt();

            Arrays.sort(x,Collections.reverseOrder()); //sorting the arrays in reverse order
            Arrays.sort(y,Collections.reverseOrder());
//            reverse(x);
//            reverse(y);

            int horizontal_count=1;  //initializing count variables
            int vertical_count=1;

            int ans=0;
            int p1=0,p2=0; //pointers initialization

            //similar to merge sort process
            while(p1<m && p2<n){ //both p1,p2 has to be less than respective lengths of array
                if(x[p1]>y[p2]){//comparing to find greater element
                    ans+=x[p1]*vertical_count; //horizontal count increases
                    horizontal_count++;
                    p1++;
                }else{
                    ans+=y[p2]*horizontal_count; //vertical count will increase
                    vertical_count++;
                    p2++;  //pointer location increases
                }
            }
            //if either of the array is still has some elements add them
            while(p1<m){
                ans+=x[p1]*vertical_count;
                p1++;
            }
            while(p2<n){
                ans+=y[p2]*horizontal_count;
                p2++;
            }
            System.out.println(ans);

            t--; //reducing test cases number of while loop
        }

    }

}


//T.C - O(n log n) // because of sorting
