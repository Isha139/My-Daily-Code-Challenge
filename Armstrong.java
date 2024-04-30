public class Armstrong {
    public static boolean isArmstrong(int n){
        int temp = n, armstrong = 0, count =0, dup = n;
        while(temp > 0){
            count ++;
            temp /= 10;
        }
        while(n > 0){
            int lastDigit = n % 10;
            armstrong += (int) Math.pow( lastDigit, count);
            n /= 10;
        }
        return (armstrong == dup);
    }
    public static void main(String[] args) {
        int n = 31;
       
        if(isArmstrong(n)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

// Output:
// 371 = true
// 1634 = true
// 13 = false