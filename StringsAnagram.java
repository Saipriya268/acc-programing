import java.util.Scanner;
public class StringsAnagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        if(areAnagram(s1,s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
    static boolean areAnagram(String s1, String s2){
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }   
}

