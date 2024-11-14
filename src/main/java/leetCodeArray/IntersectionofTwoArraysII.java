package leetCodeArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
int[] nums1 = {4,9,5,4,9}, nums2 = {9,4,9,8,4};
        int[] res=intersect(nums1,nums2);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();


        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                list.add(n);
                map.put(n, map.get(n) - 1);
            }
        }


        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
