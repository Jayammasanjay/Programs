package leetCodeArray;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    //leetcode 2441
    //Given an integer array nums that does not contain any zeros,
    // find the largest positive integer k such that -k also exists in the array.

    public static void main(String[] args) {

        int[] arr={1,2,-3,3};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        Set<Integer> set=new HashSet<>();
        int max=-1;
        for(int n:arr){
            if(set.contains(-n)){
                max=Math.max(max,Math.abs(n));
            }
            set.add(n);
        }
        return max;
    }
}
