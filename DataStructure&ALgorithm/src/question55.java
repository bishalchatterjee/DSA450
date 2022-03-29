public class question55 {
    //Longest Repeating Subsequence

    static int LongestRepeatingSubsequence(String str)
    {
        return lcs(str,str,str.length(),str.length());
    }

    static int lcs(String a,String b,int m,int n){
        int[][]dp = new int[m+1][n+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(a.charAt(i-1) == b.charAt(j-1) && i!=j ){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s="axxxy";
        System.out.println(LongestRepeatingSubsequence(s));

    }
}

//O- n(n^2)