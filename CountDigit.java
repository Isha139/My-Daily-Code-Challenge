public class CountDigit{
    public static void main(String[] args) {
        int n = 336;
        int temp = n , count = 0;

        while(n > 0){
            int lasDigit = temp % 10;

            if(lasDigit != 0 && n % lasDigit == 0){
                count ++;
            }
            temp = temp /10;
            
        }
       System.out.println(count);
    }
}