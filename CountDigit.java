public class CountDigit{
    public static int countDigits(int n) {

        int count = 0, givenNumber = n;

        while (n > 0) {

            if ((n % 10) != 0 && (givenNumber % (n % 10)) == 0) {

                count++;

            }

            n /= 10;

        }

        return count;

    }
    public static void main(String[] args) {
        int n = 336;
       System.out.println(countDigits(n));
    }
}