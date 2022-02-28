import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question57 {
    //Print all the permutations of the given string
    static String swap(String s , int i , int j){//swap function
        char ch[] = s.toCharArray();//converting to Char Array
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
        return String.valueOf(ch);//
    }
    static void permutate(ArrayList<String> al , String s , int l , int r)
    {
        if(l == r)
        {
            al.add(s);
            return;
        }
        for(int i = l; i <=r ; i++)
        {
            s = swap(s , l , i);
            permutate(al , s , l+1 , r);
            s = swap(s , l , i);
        }
    }
    static List<String> find_permutation(String s)
    {
        ArrayList<String> al = new ArrayList<>();
        permutate(al , s , 0 , s.length()-1);
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        String s="ABC";
        System.out.println(find_permutation(s));
    }
}
