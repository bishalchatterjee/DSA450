public class question47 {
    //Reverse a string
    static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
        //Print the characters
        for (char c : s) {
            System.out.print("'"+c+"'"+",");
        }
    }

    public static void main(String[] args) {
//        char s[]={'H','E','L','L','O'};
        char s[]={'B','I','S','H','A','L'};
        reverseString(s);
    }
}


//T.C- O(n)
//A.S- O(1)
