import java.util.*;
public class Q16{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array Legth
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        //Initializiation of an Array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

          //precompute
          int hash[] = new int[13];
          for(int i=0; i<n; i++){
             hash[arr[i]] += 1; 
          }
     
       int q =sc.nextInt();

       while(q-- != 0){
        int number = sc.nextInt();
        System.out.println(hash[number]);
       }
    }
}

// Input: 

// 5
// 1 3 2 1 3
// 5
// 1 4 2 3 12

// Output: 

// 2
// 0
// 1
// 2
// 0