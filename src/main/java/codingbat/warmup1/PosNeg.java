package codingbat.warmup1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            if ( a < 0 && b < 0){
                return true;
            }
        } else if (!negative){
            if (( a > 0 && b <0) || (a < 0 && b > 0)){
                return true;
            }
        }
        return false;
    }
}
