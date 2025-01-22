package leetCodeArray;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] arr, int k) {
        int[] res = {-1, -1};
        int l = 0, h = arr.length - 1, mid;

        // Find the first occurrence of k
        while (l <= h) {
            mid = (l + h) / 2;
            if (arr[mid] == k) {
                res[0] = mid;
                h = mid - 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        // Reset variables for finding the last occurrence
        l = 0;
        h = arr.length - 1;

        // Find the last occurrence of k
        while (l <= h) {
            mid = (l + h) / 2;
            if (arr[mid] == k) {
                res[1] = mid;
                l = mid + 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return res;
    }
}
