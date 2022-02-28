import java.util.HashMap;
import java.util.Map;

public class question49 {
    //Find Duplicated in a String
    static void printDuplicatesInString(String s){
        HashMap<Character, Integer> count= new HashMap<>(0);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' ') // skipping blankspaces between words (if any)
                continue;
            if(!count.containsKey(s.charAt(i)))
                count.put(s.charAt(i),1);
            else
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
        }

        //Printing Duplicates in Sorted Order
        for(Map.Entry mapElement : count.entrySet()){
            char key=(char)mapElement.getKey();
            int value=((int)mapElement.getValue());

            if(value>1)
                System.out.println(key+", count = "+value);
        }
    }
    public static void main(String[] args)
    {
        String s = "AAA BBB C DD";
        printDuplicatesInString(s);
    }
}

//T.C- O(1)
//S.C- O(n) , n-->number of characters
