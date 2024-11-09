package Arrays.Searching.Binary;

public class Problem34 {
    // 34. Find First and Last Position of Element in Sorted Array
    //Input: nums = [5,7,7,8,8,10], target = 8
    //Output: [3,4]
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] ans = new int[2];
        int first = firstAndLastOccurence(arr, 8, true);
        int last = firstAndLastOccurence(arr, 8, false);
        ans[0] = first;
        ans[1] = last;

        for (int data : ans) {
            System.out.print(data + " ");
        }
    }

    static int firstAndLastOccurence(int[] arr, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (isFirst == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
