package BasicsMaths;

import java.util.Arrays;

public class FindPrime {
    //Sieve Algorithm : To find the prime numbers
    public static void main(String[] args) {
        SieveAlgorithm(10);
    }

    public static void SieveAlgorithm(int num) {
        boolean[] arr = new boolean[num + 1];
        Arrays.fill(arr, true);

        int count = 2;
        while (count <= num) {
            if (arr[count] == true) {
                for (int factor = count+count; factor <= num; factor+=count) {
                    arr[factor] = false;
                }
            }
            count++;
        }

        for(int i = 2; i <= num; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}