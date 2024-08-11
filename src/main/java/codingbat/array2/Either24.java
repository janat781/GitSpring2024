package codingbat.array2;

public class Either24 {
    public boolean either24(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
            if (nums[i] == 2 && nums[i+1] == 2){
                for(int j = 0; j < nums.length-1; j++){
                    if (nums[j] == 4 && nums[j+1] == 4){
                        return false;
                    }
                }
                return true;
            }
            if (nums[i] == 4 && nums[i+1] == 4){
                for(int j = 0; j < nums.length-1; j++){
                    if (nums[j] == 2 && nums[j+1] == 2){
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

}
