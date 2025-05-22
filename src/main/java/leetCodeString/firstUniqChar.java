package leetCodeString;

public class firstUniqChar {
    public static void main(String[] args) {
        String s="leetcode";
        firstUniqChar fb=new firstUniqChar();
        int output=fb.firstUniq(s);
        System.out.println(output);

    }
    private int firstUniq(String s) {
        int[] freq=new int[26];
        char[] chars=s.toCharArray();
        for(char c:chars){
            freq[c-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
