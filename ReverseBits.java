//There is a song concert going to happen in the city. The price of each ticket is equal to the number obtained after reversing the bits of a given 32 bits unsigned integer ‘n’.


public class ReverseBits {
    public static long reverseBits(long n) {
		
	 long reverse = 0 ;

        for(int i = 0 ; i<32 ; i ++) {
            long  lsb = n & 1 ;

            long  reverselsb = lsb << (31-i);

            reverse = reverse | reverselsb ;

            n=n>>1;
        }
         return reverse;
        }
    public static void main(String[] args) {
        int n = 12;
        
        System.out.println(reverseBits(n));
    }
}

// Input = 12
// Output = 805306368