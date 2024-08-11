package codingbat.array2;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int arr[] = new int[nums.length];
        int delete = nums.length-1;
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 10){
                nums[i] = 0;
                arr[delete--] = nums[i];
            } else {
                arr[num++] = nums[i];
            }
        }
        return arr;
    }

}
