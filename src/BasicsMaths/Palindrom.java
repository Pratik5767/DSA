package BasicsMaths;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindrom(n);
    }

    public static void palindrom(int num) {
        int res = 0;
        int copy = num;

        while (num > 0) {
            int digit = num % 10;
            res = (res * 10) + digit;
            num /= 10;
        }

        if (res == copy)
            System.out.println("It is a Palindrom");
        else
            System.out.println("Not a Palindrom");
    }
}