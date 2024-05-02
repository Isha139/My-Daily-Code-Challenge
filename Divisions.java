public class Divisions {
    public static int SumOfDivision(int n){
          int sum = 0;
          int totalsum = 0;

          for(int i = 1; i<=n; i++){
           for(int j=1; j<=i; j++){
            if(i %j == 0)
              sum += j;
           }
          }
          return totalsum += sum;
    }
    public static void main(String[] args) {
        System.out.println(SumOfDivision(5));
    }
}


// Input : 5
// Output : 21
