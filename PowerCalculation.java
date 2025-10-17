
public class PowerCalculation {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = power(x,n);
        System.out.println(x + "raised to" + n + " is: " +result);
        
    }
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int half = power(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return x*half*half;
        }
    }
}

