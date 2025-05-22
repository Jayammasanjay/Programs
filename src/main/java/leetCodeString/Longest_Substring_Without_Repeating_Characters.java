package leetCodeString;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

//    public static int check(String s){
//        Set<Character> set=new HashSet<>();
//
//        int max=0;
//        int right=0,left=0;
//        while(right<s.length()){
//            char c=s.charAt(right);
//            if(set.add(c)){
//                max=Math.max(max,right-left+1);
//                right++;
//            }else {
//                while (s.charAt(left)!=c){
//                    set.remove(c);
//                    left++;
//                }
//                set.remove(c);
//                left++;
//            }
//
//        }
//
//        return max;
//    }
    public static int check(String s){
        Set<Character> set=new HashSet<>();
        int left=0;int maxLength=0;
        for(int right=0;right<s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int res=check(s);
        System.out.println(res);
    }
}
