import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class R1 {
    static List<String> l = new ArrayList<>();

    public static List<String> printNtimes(int n){

        if(n==0)
            return l;

            l.add("Coding Ninjas");

            n--;
            return printNtimes(n);
    }
     
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println(printNtimes(sc.nextInt()));
          sc.close();
    }
}

// Input : 3
// Output : [Coding Ninjas, Coding Ninjas, Coding Ninjas]
