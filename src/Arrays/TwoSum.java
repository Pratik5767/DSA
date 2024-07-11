package Arrays;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int result = target - arr[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }
            else {
                map.put(arr[i], i);
            }
        }
        return new int[]{0};
    }
}