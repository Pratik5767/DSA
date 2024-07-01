import java.util.Arrays;

public class MoveAllZeroesToTheEnd
{
    public static void main(String[] args)
    {
        //Move all zeroes present in an array to the end
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        MoveAllZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void MoveAllZeros(int[] nums)
    {
        int i = 0;
        int j = 1;
        while(j < nums.length)
        {
            if (nums[i] == 0 && nums[j] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}
