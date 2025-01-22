package leetCodeString;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s="  hello world  ";
        System.out.println(revers(s));

    }
    public static String revers(String s){
        String[] word=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i= word.length-1;i>=0;i--){
            sb.append(word[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
