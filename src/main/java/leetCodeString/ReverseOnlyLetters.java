package leetCodeString;

public class ReverseOnlyLetters {
//leetcode 917
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnly(s));

    }

    public static String reverseOnly(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetter(sb.charAt(i))) {
                i++;
            } else if (!Character.isLetter(sb.charAt(j))) {
                j--;
            } else {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}
/*
    public String reverseOnlyLetters(String s) {
        char array[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;

        while(i<j){

            while(i<j && !(Character.isLetter(array[i]))){
                  i++;
            }
            while(i<j && !(Character.isLetter(array[j]))){
                  j--;
            }

          char temp=array[i];
          array[i]=array[j];
          array[j]=temp;
          i++;
          j--;

        }
        return new String(array);
    }
 */

