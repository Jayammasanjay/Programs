package leetCodeString;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class wordPattern {
    //leetcode 290

    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Using a single map, ensure both mappings are consistent
            if (!Objects.equals(map.put(c, i), map.put(word, i))) {
                return false;
            }
        }

        return true;
    }
}
