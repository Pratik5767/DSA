package Arrays.Searching.Binary;
public class Problem744 {
    // 744. Find Smallest Letter Greater Than Target
    // Input: letters = ["c","f","j"], target = "a"
    // output: "c"
    public static void main(String[] args) {
        char arr[] =  {'c','f','j'};
        char res = SmallestLetter(arr, 'a');
        System.out.println(res);
    }

    static char SmallestLetter(char[] arr, char target) {
        char ans = '$';
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
                ans = arr[mid];
            }
        }

        return (ans == '$') ? arr[0] : ans;
    }
}
