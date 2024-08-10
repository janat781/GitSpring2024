package codingbat.string2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++){
            if (i < a.length()){
                sb.append(a.charAt(i));
            }
            if (i < b.length()){
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }


}
