public class Q12{
    public static int sumOfSeries(int n){
        if(n == 1){
            return 1;
        }
        
        int y = (int) Math.pow(n, 3);
        int x = sumOfSeries(n-1);
        
        return x+y;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSeries(n));
    }
}

// Input = 7
// Output = 784 
// 1^3 + 2^3 + 3^3 + 4^3 + 5^3 + 4^3 + 5^3 + 6^3 + 7^3
// Input = 5
// Output = 225
// 1^3 + 2^3 + 3^3 + 4^3 + 5^3 + 4^3 + 5^3