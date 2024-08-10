package codingbat.string2;

public class CountCode {
    public int countCode(String str) {
        int let = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i, i+4).equals("code") || str.substring(i, i+4).equals("coze") || str.substring(i, i+4).equals("cope") || str.substring(i, i+4).equals("cooe") || str.substring(i, i+4).equals("core")|| str.substring(i, i+4).equals("cole")) {
                let++;
            }


        }
        return let;
    }
}
