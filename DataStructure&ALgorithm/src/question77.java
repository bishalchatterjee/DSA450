public class question77 {
    //Find the longest common subsequence between two strings.
    //Dp Solution

    static int lcs(String s1,String s2){
        int m=s1.length();  //get length of first string
        int n=s2.length();  //get length of second string

        int dp[][]=new int[m+1][n+1];  //create 2D dp array

        for (int i = 1; i <= m ; i++) {  //start from i=1 to i<=length of first string
            for (int j = 1; j <= n ; j++) {  //start from j=1 to j<=length of second string
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];  //take diagonal value and add one to it
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]); //take max of left and top
            }
        }
        return dp[m][n]; //return the dp[m][n]
    }

    public static void main(String[] args) {
        String s1="Abcc";
        String s2="bccd";

        System.out.println(lcs(s1,s2));
    }
}


//T.C- O(n*m)
//S.C-O(n*m)  //for dp array