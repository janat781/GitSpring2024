package codingbat.array2;

public class TenRun {
    public int[] tenRun(int[] nums) {
        int last = -1;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 10 == 0 ){
                last = nums[i];
            }
            if (last != -1){
                nums[i] = last;
            }

        }
        return nums;
    }
}
