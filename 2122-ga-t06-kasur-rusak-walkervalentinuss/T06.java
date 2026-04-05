// 12S21012 - Walkervalentinuss
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        
        text = input.nextLine();
        System.out.println(palindrome(text, 0));
    }
    
    public static String palindrome(String text, int depth) {
        String isPalindrome;
        
        if (depth >= (double) text.length() / 2) {
            isPalindrome = "YA";
        } else {
            if (!String.valueOf(text.charAt(depth)).equals(String.valueOf(text.charAt(text.length() - 1 - depth)))) {
                isPalindrome = "BUKAN";
            } else {
                isPalindrome = palindrome(text, depth + 1);
            }
        }
        
        return isPalindrome;
    }
}
