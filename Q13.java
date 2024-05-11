public class Q13 {
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int f1 = Fibonacci(n-1);
        int f2 = Fibonacci(n-2);
        int f = f1 + f2;

        return f;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Fibonacci(n));
    }
}

// Input = 3
// Output = 2
// Input = 2
// Output = 1

