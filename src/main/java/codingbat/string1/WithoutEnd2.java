package codingbat.string1;

public class WithoutEnd2 {
    public String withouEnd2(String str) {
        if (str.length() > 1){
            return str.substring(1, str.length()- 1);
        } else if (str.length() == 0) {
            return str.substring(0);
        }return str.substring(1);
    }

}
