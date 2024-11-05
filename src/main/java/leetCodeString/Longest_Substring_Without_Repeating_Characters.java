package leetCodeString;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    public static int check(String s){
        Set<Character> set=new HashSet<>();

        int max=0;
        int right=0,left=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(set.add(c)){
                max=Math.max(max,right-left+1);
                right++;
            }else {
                while (s.charAt(left)!=c){
                    set.remove(c);
                    left++;
                }
                set.remove(c);
                left++;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int res=check(s);
        System.out.println(res);
    }
}
