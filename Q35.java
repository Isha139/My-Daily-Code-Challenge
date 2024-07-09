import java.util.Scanner;

public class Q35 {
    public static void moveZeros(int arr[]){
        int n = arr.length;

        int j = -1;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return ;
        }

        for(int i=j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
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
        
       moveZeros(arr);

       System.out.println("Modified Array:");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
    }
}

// Output
// Enter array length:
// 10
// Enter elements:
// 1 0 2 3 2 0 0 4 5 1
// Modified Array:
// 1 2 3 2 4 5 1 0 0 0 