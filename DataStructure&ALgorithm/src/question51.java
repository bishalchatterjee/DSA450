public class question51 {
    //check if a string is a rotation of another string

    static boolean areRotations(String str1,String str2){
        return ((str1.length()==str2.length()) && ((str1+str1).indexOf(str2)!=-1)); //length has to be equal & str2 has to be a substring of concatenation of the st1 string twice
    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
