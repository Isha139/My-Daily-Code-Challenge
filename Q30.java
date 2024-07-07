import java.util.*;
public class Q30{
    public static int removeDuplicate(int arr[]){
        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
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

        int k = removeDuplicate(arr);
        System.out.println("The array after removing duplicate element is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}

// Output
// Enter array length:
// 7
// Enter elements:
// 1 1 2 2 2 2 3 3
// The array after removing duplicate element is:
// 1 2 3