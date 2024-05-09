public class Q11 {
    static void printNos(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printNos(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
}
