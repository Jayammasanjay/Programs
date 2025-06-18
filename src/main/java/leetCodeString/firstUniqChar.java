package leetCodeString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
  //      firstUniqChar fb = new firstUniqChar();
//        int output=fb.firstUniq(s);
//        System.out.println(output);
        System.out.println(findunique(s));

    }

    //    private int firstUniq(String s) {
//        int[] freq=new int[26];
//        char[] chars=s.toCharArray();
//        for(char c:chars){
//            freq[c-'a']++;
//        }
//        for(int i=0;i<chars.length;i++){
//            if(freq[chars[i]-'a']==1){
//                return i;
//            }
//        }
//        return -1;
//    }
    private static char findunique(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
           // char c = s.charAt(i);
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '0';
    }
}
