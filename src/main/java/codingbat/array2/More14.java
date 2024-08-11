package codingbat.array2;

public class More14 {
    public boolean more14(int[] nums) {
        int n1 = 0;
        int n4 = 0;
        for(int num : nums){
            if (num == 1){
                n1++;
            }
            else if(num == 4){
                n4++;
            }
        }
        return n1 > n4;
    }

}
