import java.util.Scanner;
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        generateParentheses("", 0, 0, n);
        sc.close();
    }
    static void generateParentheses(String current, int open, int close, int n) {
        if (current.length() == 2 * n)
        {
            System.out.println(current);
            return;
        }
        if (open < n)
        {
            generateParentheses(current + "(", open + 1, close, n);
        }
        if(close < open){
            generateParentheses(current + ")",open, close+1, n);
        }
    }
}


