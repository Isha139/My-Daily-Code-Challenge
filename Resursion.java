import java.util.Arrays;

public class Resursion {
   static int count = 1;
   public static int[] outputFunction(int n, int arr[]){
    if (count == n) 
    return arr;

    arr[count] = count++;
    outputFunction(n, arr);

    return arr;
   }

   public static int[] printNos(int x){
    int [] num=new int[x];
       num= outputFunction(x,num);
       return num;
   }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Arrays.toString(printNos(x)));
    }
}

/*Output : [0, 1, 2, 3, 4]
 */
