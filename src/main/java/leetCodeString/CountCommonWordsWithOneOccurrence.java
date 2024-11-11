package leetCodeString;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"}, words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1,words2));
    }
    public static int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();

        for(String word:words1){
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        for(String word:words2){
            map2.put(word,map2.getOrDefault(word,0)+1);
        }
        int res=0;
        for(String word:words1){
            if(map1.get(word)==1 && map2.getOrDefault(word,0)==1){
                res++;
            }
        }
        return res;
    }
}
