package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,3};
        find(arr);
    }
    public static void find(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer i:arr){
            if(map.containsKey(i)){
                map.put(i, map.getOrDefault(i,0)+1);
            }else {
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
