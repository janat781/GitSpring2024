package codingbat.string2;

public class GetSandwich {
    public String getSandwich(String str) {
        int length = str.length();
        if (length < 5) {
            return "";
        }
        int firstJamIndex = str.indexOf("bread");
        int lastJamIndex = str.lastIndexOf("bread");

        if (firstJamIndex != -1 && lastJamIndex != -1 && firstJamIndex != lastJamIndex){
            return str.substring(firstJamIndex + 5, lastJamIndex);

        }
        return "";
    }

}
