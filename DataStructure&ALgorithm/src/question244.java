import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class question244 {
    //DIEHARD -DIE HARD [ SPOJ ]
    static int dp[][]=new int[1001][1001];

    static int solve(int h,int a,int i){
        if(h<=0 || a<=0) return 0;
        if(dp[h][a]!=-1)
            return dp[h][a];

        int x=0,y=0,z=0;
        if(i!=1) x=1+ solve(h+3,a+2,1);
        if(i!=2) y=1+ solve(h-5,a-10,2);
        if(i!=3) z=1+ solve(h-20,a+5,3);
        return dp[h][a]= Math.max(x,Math.max(y,z));
    }

    public static void main(String[] args) {

        for (int i=0;i<dp.length;i++){
            for (int j = 0; j <dp[1].length ; j++) {
                dp[i][j]=-1;
            }
        }

        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        System.out.println();
        while(t!=0){
            int health,armour;
            health=sc.nextInt();
            armour=sc.nextInt();

            int first_case=solve(health+3,armour+2,1);
            int second_case=solve(health-5,armour-10,2);
            int third_case=solve(health-20,armour+5,3);
            System.out.println();
            System.out.println(Collections.max(Arrays.asList(first_case,second_case,third_case)));
            t--;
        }
    }
}
