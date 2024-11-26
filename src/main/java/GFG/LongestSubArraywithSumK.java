package GFG;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraywithSumK {
    public static void main(String[] args) {
int[] arr={10, 5, 2, 7, 1, 9};
int k=15;
        System.out.println(lenOfLongestSubarr(arr,k));
    }

    public static int lenOfLongestSubarr(int[] arr, int k) {
        int sum = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                res = i + 1;
            }

            // If (sum - k) exists in the map, update res
            if (map.containsKey(sum - k)) {
                res = Math.max(res, i - map.get(sum - k));
            }

            // Add sum to the map if it's not already there
            if (!map.containsKey(sum)) {
                map.put(sum, i);

            }
        }
        return res;
    }
}
