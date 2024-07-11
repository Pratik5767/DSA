package BasicsMaths;
import java.util.HashMap;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits: ");
        int n = sc.nextInt();

        int result = sumOfDigits(n);
        System.out.println(result);
    }

    public static int sumOfDigits(int n) {
        int res = 0;
        while (n != 0) {
            int count = n % 10;
            n = n / 10;
            res = res + count;
        }
        return res;
    }
}
