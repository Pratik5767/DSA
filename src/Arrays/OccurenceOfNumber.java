package Arrays;

import java.util.Scanner;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        //WAP to calculate how many times a number occurred
        int[] arr = {1,3,4,2,10,1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fun(n, arr);
        System.out.println(result);
    }

    public static int fun(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }
}