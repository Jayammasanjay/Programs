package leetCodeString;

public class PalindromicSubstrings {
    //leetcode 647
    public static void main(String[] args) {
    //String s="abc";
        String s="aaa";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            total=total+countPalindroms(s,i,i);
            total=total+countPalindroms(s,i,i+1);
        }
        return total;
    }
    private static int countPalindroms(String str,int start,int end){
        int count=0;
        while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }

}
