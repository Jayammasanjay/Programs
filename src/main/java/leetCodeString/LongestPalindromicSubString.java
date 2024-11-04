package leetCodeString;

public class LongestPalindromicSubString {

    int max = 0;
    int start = 0;
    int end=0;

    public boolean isPalindrom(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrom(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrom(s, i, j)) {
                    if ((j - i + 1) > max) {
                        max = j - i + 1;
                        start = i;
                        end=j;
                    }
                }
            }
        }

        return s.substring(start, end+1);
    }

    public static void main(String[] args) {
        LongestPalindromicSubString lps = new LongestPalindromicSubString();
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + lps.longestPalindrom(s));
    }
    /*
    O(n) time complexity
     public static String longestPalindrome(String s) {
	        int start=0,end=0;
	        for(int i=0;i<s.length();i++){
	            int len1=expandFromCentre(s,i,i+1);
	            int len2=expandFromCentre(s,i,i);
	            int len=Math.max(len1,len2);
	            if(end-start<len){
	                start=i-(len-1)/2;
	                end=i+len/2;
	            }
	        }

	        return s.substring(start,end+1);
	    }
	    private static int expandFromCentre(String s,int i,int j){
	        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
	            i--;j++;
	        }
	        return j-i-1;
	    }
     */
}
