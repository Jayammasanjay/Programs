package leetCodeArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesInSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int res = removeDuplicate(arr);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int n : arr) {
            if (i < 2 || n != arr[i-2]) {
                arr[i]=n;
                i++;
            }
        }
        return i;
    }
}
    /*
      public int removeDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) <= 2) {
                nums[index++] = num;
            }
        }
        return index;
    }

    ---------------------------------------------
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> duplicates = new HashMap<>();
        int count = 1;
        duplicates.put(nums[0], 1);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                int duplCount = duplicates.getOrDefault(nums[i], 0);
                if (duplCount < 2) {
                    nums[count++] = nums[i];
                    duplicates.put(nums[i], ++duplCount);
                }
            } else {
                nums[count++] = nums[i];
                int duplCount = duplicates.getOrDefault(nums[i], 0);
                duplicates.put(nums[i], ++duplCount);
            }
        }

        return count;
    }
     */

