package leetCodeString;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
    String s = "egg", t = "add";
    boolean result=check(s,t);
        System.out.println(result);
    }
    public static boolean check(String s,String t){
        if(s.length()!=t.length())return false;
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=s.charAt(i);

            if(map.containsKey(cs)){
                if(!map.get(cs).equals(ct)){
                    return false;
                }
            }else {
                if(map.containsValue(ct)){
                    return false;
                }
                map.put(cs,ct);
            }
        }
        return true;
    }
}
