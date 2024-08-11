package codingbat.array2;

public class Sum13 {
    public int sum13(int[] nums) {
//  int num = nums[0];
        int sum = 0;
        int n = 13;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == n){
                ++i;
            } else{
                sum += nums[i];
            }
        }
        return sum;
    }

}
