package leetCodeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> res=threeSum(nums);
        System.out.println(res);
    }
  public static List<List<Integer>> res=new ArrayList<>();
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                twosum(i+1,nums.length-1,nums,0-nums[i]);
            }
        }
        return res;
    }

   static void twosum(int i,int j,int[] nums,int target){
        int a=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(a);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);

                while(i<j && nums[i]==nums[i+1])i++;
                while(i<j && nums[j]==nums[j-1])j--;

                i++;j--;
            }
        }
    }
}
