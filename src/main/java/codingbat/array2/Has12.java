package codingbat.array2;

public class Has12 {
    public boolean has12(int[] nums) {
        boolean first = false;
        for (int num : nums){
            if (num == 1){
                first = true;
            }
            else if (num == 2 && first){
                return true;
            }
        }
        return false;
    }



}
