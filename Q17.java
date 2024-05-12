import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //precompute
        int hash[] = new int [26];
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++; 
        }
        
        int q = sc.nextInt();
        while(q-- > 0){
            char c = sc.next().charAt(0);
            //fetch
            System.out.println(hash[c - 'a']); 
        }
   
    }
}

// Input: 

// abcdabehf
// 5
// a
// g
// h
// b
// c

// Output: 2
// 0
// 1
// 2
// 1
