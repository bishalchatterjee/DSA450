import java.util.Stack;

public class question278 {
    //Function to check if brackets are balanced or not.
    static boolean isBalancedParenthesis(String x)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++){

            char c=x.charAt(i);

            //if c is a open bracket
            if(c=='(' || c=='{' || c=='[')
                s.push(c);

                //if c contains a closing bracket
            else
            {
                //if stack is not empty
                if(!s.empty())
                {
                    char top=s.peek();
                    if(top=='(' && c==')' || top=='{' && c=='}' ||top=='[' && c==']' )
                        s.pop();

                    else
                        return false;

                }

                else
                    return false;
            }

        }

        if(s.size()==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String x="{([])}";
        System.out.println(isBalancedParenthesis(x));
    }
}
