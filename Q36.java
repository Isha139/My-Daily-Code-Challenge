import java.util.*;
public class Q36 {
   static int linearSeach(int arr[], int n, int k){
      for(int i=0; i<n; i++){
            if(arr[i] == k){
               return arr[i];
            }
      }
      return -1;
   }
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int k = sc.nextInt();

        System.out.println(linearSeach(arr, n, k));
     }
    
}

// Output
// Enter array length:
// 5
// Enter elements:
// 6 7 8 4 1
// Enter number to search:
// 4
// 4

// Enter array length:
// 5
// Enter elements:
// 6 7 8 4 1
// Enter number to search:
// 10
// -1