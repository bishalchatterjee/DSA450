import java.util.Stack;

public class question42 {
    //Maximum size rectangle

    static int[] nextSmallerLeft(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        ans[0] = -1;
        st.push(0);

        for(int i = 1 ; i < n ; i++){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

     static int[] nextSmallerRight(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        ans[n - 1] = n;
        st.push(n - 1);

        for(int i = n - 2 ; i >= 0 ; i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = n;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

     static int largestRectangleArea(int[] heights) {
        int[] nsl = nextSmallerLeft(heights); // nsl : next smaller on left
        int[] nsr = nextSmallerRight(heights); // nsr : next Smaller on right

        int ans = 0;

        for(int i = 0 ; i < heights.length ; i++){
            int width = nsr[i] - nsl[i] - 1;
            int h = heights[i];

            int area = h * width;

            ans = Math.max(ans , area);
        }
        return ans;
    }

    static int maxArea(int matrix[][], int n, int m) {
        // add code here.
        n = matrix.length;
        m = matrix[0].length;
        int[] arr = new int[m];
        int max = 0;

        for(int i= 0 ;i < n; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] ==  0){
                    arr[j] = 0;
                }
                else{
                    arr[j] += 1;
                }
            }
            int area = largestRectangleArea(arr);
            max = Math.max(area , max);
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        int M[][] = {{0,1,1,0},
                     {1,1,1,1},
                     {1,1,1,1},
                     {1,1,0,0}};
        System.out.println(maxArea(M,n,m));
    }
}


//T.C- O(n*m)
//A.S- O(m)