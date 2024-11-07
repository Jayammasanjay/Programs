package leetCodeArray;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    result[0] = i;
                    result[1] = map.get(nums[i]);
                    return result;
                } else {
                    map.put(target - nums[i], i);
                }
            }

            return result;
        }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=17;
        int[] ans=twoSum(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    }

