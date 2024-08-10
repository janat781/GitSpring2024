package codingbat.string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        int len = str.length();
        String repeatedStr = "";
        for (int i = 0; i < n; i++) {
            // if (n > len){
            // return n = len;
            repeatedStr += str.substring(len - n);
        }
        return repeatedStr;
    }
}
