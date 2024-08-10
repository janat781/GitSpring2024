package codingbat.string2;

public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        int length = str.length();
        if (length < 3) {
            return false;
        }
        int middleIndex = length / 2;
        boolean isEvenLength = length % 2 == 0;
        if (isEvenLength) {
            String middle1 = str.substring(middleIndex - 2, middleIndex + 1);
            if (middle1.equals("xyz")) {
                return true;
            }
            String middle2 = str.substring(middleIndex - 1, middleIndex + 2);
            if (middle2.equals("xyz")) {
                return true;
            }
        } else {
            // Для нечетной длины строки
            String middle = str.substring(middleIndex - 1, middleIndex + 2);
            if (middle.equals("xyz")) {
                return true;
            }
        }

        return false;
    }
}
