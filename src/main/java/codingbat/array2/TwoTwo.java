package codingbat.array2;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == 2) {
                // Check if the next number is also 2
                if (i + 1 < nums.length && nums[i + 1] == 2) {
                    // Skip over the group of 2s
                    while (i + 1 < nums.length && nums[i + 1] == 2) {
                        i++;
                    }
                } else {
                    // If a 2 is not adjacent to another 2
                    return false;
                }
            }
            i++;
        }

        return true;
    }


}
