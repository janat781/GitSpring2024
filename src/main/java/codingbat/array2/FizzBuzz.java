package codingbat.array2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String nums [] = new String[end - start];
        for (int i = start; i < end; i++){
            String res;
            if (i % 3 == 0 && i % 5 == 0){
                res = "FizzBuzz";
            }
            else if (i % 3 == 0){
                res = "Fizz";
            }
            else if (i % 5 == 0){
                res = "Buzz";
            }

            else {
                res = String.valueOf(i);
            }
            nums[i - start] = res;
        }
        return nums;
    }

}
