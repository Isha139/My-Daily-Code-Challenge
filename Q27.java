import java.util.*;
public class Q27 {
    public static int largestElement(int arr[]){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
             if(arr[i] > max){
                max = arr[i];
             }
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest ekement is: "+largestElement(arr));
    }
}

// Output
// Enter Array length:
// 5
// 1 0 2 5 9
// Largest ekement is: 9
