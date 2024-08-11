package codingbat.array2;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        for(int i = 0; i < len; i++){
            if (len == 0){
                return true;
            }
            if ( nums[i] != nums[nums.length - len + i]){
                return false;
            }

        }
        return true;
    }
}
