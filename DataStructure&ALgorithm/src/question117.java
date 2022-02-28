public class question117 {
    //Find Missing number in AP
    //A=Starting term,C=Common Difference,B=term to be searched in the AP
    static int inSequence(int A, int B, int C){
        if(C==0)
        {
            if(A==B)
                return 1;
            else
                return 0; //if not present
        }
        else
        {
            if((B-A)/C < 0)
                return 0;
            else
            {
                if((B-A)%C==0)
                    return 1;
                else
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        int A=1,B=3,C=2;
        System.out.println(inSequence(A,B,C));
    }
}
