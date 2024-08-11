package codingbat.array2;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int four = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums [i] == 4){
                four = i;
                break;
            }
        }
        int arr[] = new int[four];

        for (int i = 0; i < arr.length; i ++){
            arr [i] = nums[i];
        }
        return arr;
    }

}
