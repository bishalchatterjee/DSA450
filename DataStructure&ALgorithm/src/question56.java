public class question56 {
    //Print all Subsequences of a string.
    static void printSubsequence(String s){
        String ans=""; // initializing ans
        printSubsequenceHelper(s,ans); //calling helper function
    }
    static void printSubsequenceHelper(String s, String ans){
        if(s.length()==0){ // base case if the length of the string is 0 print it and return
            System.out.println(ans);
            return;
        }
        char ch =s.charAt(0); //extract the first character
        String restOfTheString=s.substring(1); //get all the other characters except previously extracted character (ch)

        //Now we either select the picked character or we don't
        printSubsequenceHelper(restOfTheString,ans+"");  // we don't select the extracted ch and add empty string with ans
        printSubsequenceHelper(restOfTheString,ans+ch); //we  select the extracted ch and add it to our ans

    }

    public static void main(String[] args) {
        String s="ABC";
        printSubsequence(s);
    }
}

//T.C- O(n)


/*
Why Do avoid storing the generated subsequence in any list?
Ans- If the given string is of any length the cost of storing every subsequence in the memory occupied by function call stack
     will be 2^(n-1) * n
     So it requires huge gbs of memory in ram and this operation is highly costly in terms of memory

    WhereAs, the above solution computes every possible subsequence and prints it rather than storing.
    so it's highly optimal in terms of memory usage with only (n+1)*n calls in memory occupied by function call stack
 */
