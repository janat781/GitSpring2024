package codingbat.array2;

public class No14 {
    public boolean no14(int[] nums) {
        for (int num : nums){
            if (num == 1){
                for(int innerNum : nums){
                    if (innerNum == 4){
                        return false;
                    }
                }
            }
            if (num == 4){
                for (int innerNum1 : nums){
                    if (innerNum1  == 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
