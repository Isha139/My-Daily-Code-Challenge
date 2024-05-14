import java.util.*;
public class Q19 {

    public static void maxFrequency(int[] nums, int k){

        boolean visited[] = new boolean[k];
        int maxfreq = 0, minfreq = k;
        int maxE = 0, minE = 0;

        for(int i=0; i<k; i++){
            
            if(visited[i] == true){
                continue;
            }

            int count = 1;
            for(int j=i+1; j<k; j++){
                   if(nums[i] == nums[j])
                   visited[j] = true;
                   count ++;
            }

            if (count > maxfreq) {
                maxE = nums[i];
                maxfreq = count;
            }

            if(count < minfreq){
                minE = nums[i];
                minfreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxE);
        System.out.println("The lowest frequency element is: " + minE);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // int k = sc.nextInt();
        maxFrequency(arr, n);
    }
}

// Input: 6
// 10 5 10 15 10 5
// Output :
// The highest frequency element is: 10
// The lowest frequency element is: 15