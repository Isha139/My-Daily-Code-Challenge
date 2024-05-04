public class GCD {
    public static int gcd(int n, int m){
         while(n > 0 && m > 0){
               if(n > m){
                  n = n % m;
               }else{
                m = m % n;
               }
         }

         if(n == 0){
            return m;
         }
         return n;
    }
    public static void main(String[] args) {
        int n =20;
        int m =15;
        System.out.println(gcd(n, m));
    }
}
