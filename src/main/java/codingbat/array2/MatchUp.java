package codingbat.array2;

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            if (Math.abs(nums1[i] - nums2[i]) < 3 && Math.abs(nums1[i] - nums2[i]) !=0 ){
                count++;
            }
        }
        return count;
    }


}
