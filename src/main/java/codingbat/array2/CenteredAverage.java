package codingbat.array2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;


        for (int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }


        int count = nums.length - 2;

        sum -= min;
        sum -= max;

        return sum / count;
    }

}
