import java.util.ArrayList;

public class question54 {
    //Longest Palindrome in a String / Longest Palindromic subsequence in a String
    static int palindromCheck(String S)
    {
        for(int i=0,j=S.length()-1;i<=j;i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                return 0;
            }

        }
        return S.length();
    }
    static String longestPalindrom(String S) {
        String x = "";
        String max = "";
        int indexMax = 0;
        int index = 0;
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i < S.length(); i++) {
            index = i;
            for (int j = i; j < S.length(); j++) {
                x = x + S.charAt(j);

                if (palindromCheck(x) > 0) {
                    if (x.length() > max.length()) {
                        max = x;
                        indexMax = i;
                    }
                    if (x.length() == max.length()) {
                        if (indexMax > index) {
                            max = x;
                        }
                    }

                }

            }
            x = "";
        }
        return max;
    }
    public static void main(String[] args) {
        String s="aaaabbaa";
        System.out.println(longestPalindrom(s));

    }
}

//O- n(n^2)

/*
Input:
S = "aaaabbaa"
Output: aabbaa
Explanation: The longest Palindromic
substring is "aabbaa".
 */