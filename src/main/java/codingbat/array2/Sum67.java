package codingbat.array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        int i = 0;
        if (nums.length == 0){
            return 0;
        }
        while(i < nums.length){
            if (nums[i] == 6){
                while ( i < nums.length && nums[i] != 7){
                    i++;
                }
                if (i < nums.length && nums[i] == 7){
                    i++;
                }
            } else{
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

}
