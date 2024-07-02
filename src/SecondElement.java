public class SecondElement
{
    public static void main(String[] args)
    {
        //Print the second_largest number in the array
        int[] arr = {1, 34, 12, 10, 11};
        int max_value = Integer.MIN_VALUE;
        int s_max_value = Integer.MIN_VALUE;

        int result = secondLargest(arr, max_value, s_max_value);
        System.out.println(result);
    }

    public static int secondLargest(int[] arr, int max_value, int s_max_value)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max_value)
            {
                s_max_value = max_value;
                max_value = arr[i];
            }
            else if (max_value > arr[i] && arr[i] > s_max_value)
            {
                s_max_value = arr[i];
            }
        }
        return s_max_value;
    }
}
