public class ClimbStairs {
    static int countway(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countway(n-1)+countway(n-2);
    }
        public static void main(String[] args) {
        int n = 4;
        int result = countway(n);
        System.out.println(result);
    }
}

