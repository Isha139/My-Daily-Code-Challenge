import java.util.Scanner;

public class Q29 {
    public static boolean checkRotatedSorted(int arr[]){
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n ; i++){
            if(arr[i] > arr[(i+1) % n]){
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }

        System.out.println(checkRotatedSorted(arr));
    }
}

// Output
// Enter array length:
// 5
// 3 4 5 1 2
// true