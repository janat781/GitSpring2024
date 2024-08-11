package codingbat.array2;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int zero = 0;
        int arr[] = new int [nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                arr[zero++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                arr[zero++] = nums[i];
            }
        }

        return arr;

    }
}
