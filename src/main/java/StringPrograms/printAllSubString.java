package StringPrograms;

public class printAllSubString {
    public static void main(String[] args) {
        String s="geeks";
        subString(s);
    }
    public static void subString(String s){
//        for(int i=0;i<s.length();i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                for (int k = i; k < j; k++) {
//                    System.out.print(s.charAt(k) + " ");
//                }
//                System.out.println();
//            }
//        }

        //optmization
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }

    }
}
