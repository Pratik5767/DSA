package Arrays;

public class Duplicates {
    public static void main(String[] args) {
        //Find duplicates in the array
        int[] arr = {1, 3, 4, 5, 1, 3};
        duplicate(arr);
    }

    public static void duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
