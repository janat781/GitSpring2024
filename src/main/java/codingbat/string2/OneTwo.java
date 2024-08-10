package codingbat.string2;

public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate over the string with a step of 3
        for (int i = 0; i < str.length(); i += 3) {
            // Check if there are at least 3 characters remaining
            if (i + 2 < str.length()) {
                // Extract the group of three characters
                char first = str.charAt(i);
                char second = str.charAt(i + 1);
                char third = str.charAt(i + 2);

                // Append them in the shifted order
                result.append(second).append(third).append(first);
            } else {
                // If there are less than 3 characters remaining, break the loop
                break;
            }
        }
        return result.toString();
    }
}
