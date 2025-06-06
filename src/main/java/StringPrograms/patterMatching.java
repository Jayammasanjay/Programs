package StringPrograms;

public class patterMatching {
    public static void main(String[] args) {
        String s="AAAAA";
        String Pat="AAA";
        match(s,Pat);
    }
    public static void match(String s, String pattern){
        for(int i=0;i<s.length()-pattern.length()+1;i++){
            if(s.substring(i,i+pattern.length()).equals(pattern)){
                System.out.print(i+" ");
            }
        }


    }
}
