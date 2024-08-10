package codingbat.string2;

public class ZipZap {
    public String zipZap(String str) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < str.length() - 2) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                res.append("zp");
                i += 3; // skip over 'z', the next character, and 'p'
            } else {
                res.append(str.charAt(i));
                i++;
            }
        }
        // Append any remaining characters after the last "zp"
        while (i < str.length()) {
            res.append(str.charAt(i));
            i++;
        }
        return res.toString();
    }

}
