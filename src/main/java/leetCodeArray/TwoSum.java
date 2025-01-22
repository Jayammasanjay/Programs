package leetCodeArray;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    result[1] = i;
                    result[0] = map.get(nums[i]);
                    return result;
                } else {
                    map.put(target - nums[i], i);
                }
            }

            return result;
        }
        /*
        import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}

         */

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] ans=twoSum(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    }

