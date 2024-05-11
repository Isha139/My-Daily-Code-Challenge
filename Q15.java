import java.util.*;
public class Q15 {
   
    public static boolean isPalindrome (int i, String s){
        if (s == null){
            return true;
        }

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (i >= s.length() /2) {
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length() -i-1)){
            return false;
        }

       return isPalindrome(i+1, s);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(0, s));
    }

}

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.