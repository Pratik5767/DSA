package Arrays;
public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int[] res = new int[11];

        for (int i = 0; i < arr.length; i++) {
            res[arr[i]] = res[arr[i]]+1;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println("freq -> " + res[i]);
        }
    }
}
