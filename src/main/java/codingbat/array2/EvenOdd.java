package codingbat.array2;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int first = 0;
        int second = nums.length - 1;
        int arr [] = new int [nums.length];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                arr[second--] = nums[i];
            }
            if (nums [i] % 2 == 0){
                arr[first++] = nums[i];
            }
        }

        return arr;
    }
}
