import java.util.HashSet;
import java.util.Scanner;
public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the string:");
        String s = sc.nextLine();
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }
    static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;
        while(right<s.length()){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength,right - left+1);
            right++;      
        }
        return maxLength;
    }
}
