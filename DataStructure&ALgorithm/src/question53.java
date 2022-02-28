public class question53 {
    //Count and Say problem
    /*
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
     */


    static String countAndSay(int n) {
        if (n == 1) {  // base case
            return "1";
        }
        String sub = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < sub.length(); i++) {
            char c = sub.charAt(i);
            if (i < sub.length() - 1 && c == sub.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count).append(c);
                count = 1;
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int n=4;
        System.out.println(countAndSay(n));
    }
}
