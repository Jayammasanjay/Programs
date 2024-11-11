package leetCodeString;

public class IsSubsequences {
    public static void main(String[] args) {
    String s="abc",t="ahberc";
        System.out.println(check(s,t));
    }

    public static boolean check(String s,String t){

        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
    return false;
    }
}
