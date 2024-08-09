package codingbat.string2;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        char ch1 = 'h';
        char ch2 = 'i';
        for (int i = 0; i < str.length() - 1; i++){
            char ch = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (ch == ch1 && nextChar == ch2){
                count++;
            }
        }
        return count;
    }


}
