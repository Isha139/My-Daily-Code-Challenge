import java.util.*;
public class Q14 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int i, int arr[], int n){
        if(i >= n/2){
            return ;
        }
        
        swap(arr, i, n-i-1);
        reverse(i+1, arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int [n];

        //Initialize array with values for demonstration
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //Reversed Array
        reverse(0, arr, n);

        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}


// Input : n = 5
// 1 2 3 4 5
// Output : 5 4 3 2 1 
