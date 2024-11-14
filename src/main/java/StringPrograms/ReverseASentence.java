package StringPrograms;

public class ReverseASentence {
    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        String reversed = reverse(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversed);
    }
    public static String reverse(String s){
        String[] str=s.split(" ");
        int i=0,j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return String.join(" ",str);
    }
}
