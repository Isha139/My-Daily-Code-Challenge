//Check whether a given number ’n’ is a palindrome number.
public class Pallindrome {
    public static boolean isPallindrome(int n){
        int temp = n;
        int rev = 0;

        while(temp > 0){
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }
        if(n ==rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPallindrome(121));
    }
}
