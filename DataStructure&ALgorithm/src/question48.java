public class question48 {
    //Check for Palindrome String
    static int isPalindrome(String s) {
        int first = 0, last = s.length() - 1;
        while (first < last) {
            if (s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            } else {
                return 0;// for not palindrome
            }
        }
        return 1; //for palindrome
    }

    public static void main(String[] args) {
        String s=new String("MAM");
        System.out.println(isPalindrome(s));


    }
}
