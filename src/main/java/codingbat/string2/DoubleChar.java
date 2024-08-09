package codingbat.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }

}
