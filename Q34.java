import java.util.Scanner;

public class Q34 {
    public static void Rotateright(int arr[], int k){
        int n = arr.length;

        if(n == 0)
           return;
        
        k = k % n;
        if(k > n){
            return;
        }

        int[] temp = new int[k];
        for(int i=n-k; i<n; i++){
            temp[i - n + k] = arr[i];
        }

        for(int i=n-k-1; i>=0; i--){
            arr[i+k] = arr[i];
        }

        for(int i=0; i<k; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k to shift places:");
        int k = sc.nextInt();
         Rotateright(arr, k);

         System.out.println("After rotating:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Output
// Enter array length:
// 7
// Enter elements:
// 1 2 3 4 5 6  7
// Enter k to shift places:
// 2
// After rotating:
// 6 7 1 2 3 4 5
