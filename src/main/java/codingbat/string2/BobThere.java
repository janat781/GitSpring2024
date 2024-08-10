package codingbat.string2;

public class BobThere {
    public boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++ ){
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 2);
            if(ch == 'b' && ch1 == 'b'){
                return true;
            }
        }
        return false;
    }

}
