package codingbat.string2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        String str1 = str.substring(1);
        return str1.contains(prefix);
    }
}
