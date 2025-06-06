package StringPrograms;

public class substring {
    //print all the substring given window is 4
    public static void main(String[] args) {
        String s="mississippi";
        sub(s);

    }
    public static void sub(String s){
        for (int i=0;i<=s.length()-4;i++){
            String t=" ";
            for (int j=i;j<i+4;j++){
                t=t+s.charAt(j);
            }
            System.out.println(t);
        }
    }
//    public static void sub(String s) {
//        if (s.length() < 4) return; // Handle strings shorter than 4
//
//        for (int i = 0; i <= s.length() - 4; i++) {
//            System.out.println(s.substring(i, i + 4));
//        }
//    }
}
