import java.util.HashMap;

public class question88 {
    //Check if two given strings are isomorphic to each other
    //one to one mapping implementation
    static boolean areIsomorphicStrings(String s, String s2){
        int n=s.length(); //get length of first string
        int m=s2.length(); // get length of second string
        if(n!=m) return false;  //if both length do not match return false
        HashMap<Character, Character>map1 =new HashMap<>();  //one hash map for one to one mapping of two chars
        HashMap<Character, Boolean>map2=new HashMap<>();  //one hash map fpr keeping track of already visited
        
        for (int i = 0; i < n ; i++) {
            char ch1=s.charAt(i);    // we pick up character at i from first string
            char ch2=s2.charAt(i);  // then from the target string

            if(map1.containsKey(ch1)){          //check if the map1 already contains the character from first string
                if(map1.get(ch1)!=ch2) return false;   //if the corresponding mapped char of ch1 doesn't match with ch2 then return false because it is mapped with different character
            }else{     // the ch1 is not present in map1
                if(map2.containsKey(ch2)) return false;   //check if the map 2 contains ch2 then return false
                map1.put(ch1,ch2);  //otherwise, put ch1 ,ch2 and map them one to one
                map2.put(ch2,true);  //mark the ch2 as visited in map2
            }
        }
        return true;  //finally, return true
    }

    public static void main(String[] args) {
        String s = "abaab";
        String t = "xyxxy";
        System.out.println(areIsomorphicStrings(s,t));
    }
}
//T.C - O(Length of either of the strings)