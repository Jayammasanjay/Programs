package leetCodeArray;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = convert(s);
        System.out.println(res);  // Output: 1994
    }

    public static int convert(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            // Check for invalid characters
            if (!map.containsKey(currentChar)) {
                throw new RuntimeException("Character Not Found: " + currentChar);
            }

            int currentValue = map.get(currentChar);

            // Check if the current character should be subtracted
            if (i < length - 1 && currentValue < map.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;
    }
}
