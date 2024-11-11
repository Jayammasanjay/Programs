package leetCodeArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoArrays {

    public static void main(String[] args) {
      //  int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] res=intersection(nums1,nums2);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int n2:nums2){
            set.add(n2);
        }
        List<Integer> list=new ArrayList<>();
        for(int n1:nums1){
            if(set.contains(n1)){
                list.add(n1);
                set.remove(n1);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
