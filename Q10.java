public class Q10 {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int [x];
        int n = x;
   
       f(x, arr, n);
       return arr;

    }
    public static void f(int x, int arr[], int n){
        if(x == 0){
            return;
        }
        arr[n-x] = x;
        f(x-1, arr, n);
    }
    public static void main(String[] args) {
        int x = 5;
        int arr[] = printNos(x);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
    }}
