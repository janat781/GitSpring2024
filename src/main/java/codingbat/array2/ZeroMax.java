package codingbat.array2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = nums.length-1; i >= 0; i--){
            if (nums[i] % 2 != 0){
                if (nums[i] > max){
                    max = nums[i];
                }
            } else if(nums[i] == 0) {
                if (max != Integer.MIN_VALUE){
                    nums[i] = max;
                }

            }
        }

        return nums;
    }


}
