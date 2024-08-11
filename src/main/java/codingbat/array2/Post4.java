package codingbat.array2;

public class Post4 {
    public int[] post4(int[] nums) {
        int lastFour = -1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 4){
                lastFour = i;
            }
            if (lastFour == nums.length - 1){
                return new int[0];
            }
        }
        int arr [] = new int[nums.length - lastFour -1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[lastFour + 1 + i];
        }

        return arr;

    }

}
