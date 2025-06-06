package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class subString_Without_Repeating {
    public static void main(String[] args) {
        String s="pwwkew";
       // String s="abcabcdd";

        System.out.println(rep(s));

    }
//    public static String rep(String s){
//        Set<Character>set=new HashSet<>();
//        StringBuffer sb=new StringBuffer();
//        int left=0;
//        for(int right=0;right<s.length();right++){
//            if(set.contains(s.charAt(right))){
//                set.remove(s.charAt(left));
//                left++;
//            }else {
//                set.add(s.charAt(right));
//                sb.append(s.charAt(right));
//            }
//        }
//        return sb.toString();
//    }
public static String rep(String s) {
    Set<Character> set = new HashSet<>();
    int left = 0, right = 0;
    int maxLen = 0;
    int startIndex = 0;

    while (right < s.length()) {
        if (!set.contains(s.charAt(right))) {
            set.add(s.charAt(right));
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIndex = left;
            }
            right++;
        } else {
            set.remove(s.charAt(left));
            left++;
        }
    }

    return s.substring(startIndex, startIndex + maxLen);
}
}
