package leetCodeString;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
    String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);


        return Arrays.equals(c, c1);
    }

}