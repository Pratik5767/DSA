import java.util.Arrays;

public class SecondLargestElement
{
    public static void main(String[] args)
    {
        //Print the second_largest number in the array
        int[] arr = {1, 34, 12, 10, 11};
        int max_value = Integer.MIN_VALUE;
        int smax_value = Integer.MIN_VALUE;

        int result = secondLargest(arr, max_value, smax_value);
        System.out.println(result);
    }

    public static int secondLargest(int[] arr, int max_value, int smax_value)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max_value)
            {
                smax_value = max_value;
                max_value = arr[i];
            }
            else if (max_value > arr[i] && arr[i] > smax_value)
            {
                smax_value = arr[i];
            }
        }
        return smax_value;
    }
}
