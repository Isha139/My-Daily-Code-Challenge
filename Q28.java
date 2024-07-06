import java.util.*;
public class Q28{
    public static int secondSmallest(int arr[], int n){
        if(n < 2){
            return -1;
        }
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static int secondLargestelement(int arr[], int n){
       if(n < 2){
        return -1;
       }

        int largest = arr[0];
        int slargest = -1;

        for(int i=1; i<arr.length; i++){
             if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
             }
             else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
             }
        }
        return slargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest element is: "+secondLargestelement(arr,n) + "\nSecond Smallest element is: "+ secondSmallest(arr, n));
    }
}

// Output
// Enter array length:
// 6
// 12 35 1 10 34 1
// Second Largest element is: 34
// Second Smallest element is: 10