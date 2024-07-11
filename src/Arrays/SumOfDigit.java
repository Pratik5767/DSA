package Arrays;
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Develop a program to find the sum of digits of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits: ");
        int n = sc.nextInt();

        int result = sumOfDigit(n);
        System.out.print("sum of digits are :" + result);
    }
    public static int sumOfDigit(int n) {
        int result = 0;
        while (n != 0) {
             int count = n % 10;
            n = n / 10;
            result = result + count;
        }
        return result;
    }
}