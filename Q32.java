import java.util.Scanner;

public class Q32 {
    public static void leftRotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];

        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
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
        leftRotate(arr);
        
    }
}

// Output
// Enter array length:
// 5
// Enter elements:
// 1 2 3 4 5
// 2 3 4 5 1