import java.util.Scanner;

public class question115 {
    //EKO SPOJ
   //Using Advance Binary Search and Predicate Function (Monotoneus function)
    static boolean isWoodSufficient(long h,int trees[],int n,int m){//the predicate function
        long wood=0;
        for (int i = 0; i < n; ++i) {
            if(trees[i]>=h)
                wood+=(trees[i]-h);
        }
        return wood>=m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of trees-height array");
        int n=sc.nextInt();
        System.out.println("Enter Wood requirement");
        int m=sc.nextInt();
        int[] trees =new int[(int)1e6+10];
        System.out.println("Enter the height array of trees");
        for (int i = 0; i < n ; ++i) {
            trees[i]=sc.nextInt();
        }
        //starting binary search
        long low=0,high=1000000000,mid;
        while((high - low )>1){
            mid=(high+low)/2;
            if(isWoodSufficient(mid,trees,n,m))
                low=mid;
            else
                high=mid - 1;
        }
    if(isWoodSufficient(high,trees,n,m))
        System.out.println("The maximum height to place the sawblade : "+high);
    else
        System.out.println("The maximum height to place the sawblade : "+low);
    }
}


//T.C- O(n log (H))
//Binary Search
