import java.util.Scanner;

public class Q33 {
    public static void Rotateleft(int arr[], int k){
        int n = arr.length;

        if(n == 0){
            return;
        }
        k = k % n;
        if(k > n)
           return;
        int temp[] = new int [k];
        for(int i=0; i<k; i++){//storing temp elemennts 
            temp[i] = arr[i];
        }

        for(int i=k; i<n;i ++){  //shifting
            arr[i-k] = arr[i];
        }

        for(int i=n-k; i<n; i++){ //puting back to temp
            arr[i] = temp[i - n + k];
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
        Rotateleft(arr, k);
        
        System.out.println("After Rotating to left:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
    }
}

// Output
// Enter array length:
// 7
// Enter elements:
// 1 2 3 4 5 6 7   
// Enter k to shift places:
// 2
// After Rotating to left:
// 3 4 5 6 7 1 2