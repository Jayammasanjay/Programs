package leetCodeString;

import java.util.Arrays;

public class LongestCommon_prefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(findCommon(strs));
    }
    public static String findCommon(String[] strs){
        // Sort the array
        Arrays.sort(strs);

        String s1 = strs[0];
        String sl = strs[strs.length - 1];
        int i = 0;

        // Find common prefix between the first and last string in the sorted array
        while (i < s1.length() && i < sl.length()) {
            if (s1.charAt(i) == sl.charAt(i)) {
                i++;
            } else {
                break;
            }
        }


        return i==0?"":s1.substring(0, i);
    }
}
