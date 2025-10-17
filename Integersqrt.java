public class Integersqrt {
    public static void main(String args[]){
        int N = 27;
        System.out.println("Integer square root: " + integerSqrt(N));
    }

    public static int integerSqrt(int N) {
        if (N == 0 || N == 1)
            return N;
        int start = 1, end = N / 2;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid <= N / mid) {
                ans = mid;
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
