import java.util.Scanner;

public class Q31 {
    public static void rightRotate(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];

        for(int j=n-2; j>=0; j--){
            arr[j+1] = arr[j];
        } 
       arr[0] = temp;

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
        rightRotate(arr);
        
    }
}

// Output
// Enter array length:
// 5
// Enter elements:
// 1 2 3 4 5 
// 5 1 2 3 4 
