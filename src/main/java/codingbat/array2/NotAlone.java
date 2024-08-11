package codingbat.array2;

public class NotAlone {
    public int[] notAlone(int[] nums, int val) {
        int value = val;
        int res [] = nums.clone();
        for (int i = 1; i < nums.length-1; i++){
            if (nums[i] == value && value != nums[i-1] && value != nums[i+1]){
                if(nums[i-1] > nums[i+1]){
                    res[i] = nums[i-1];
                }
                if (nums[i-1] < nums[i+1]){
                    res[i] = nums[i+1];
                }
            }
        }
        return res;

    }

}
