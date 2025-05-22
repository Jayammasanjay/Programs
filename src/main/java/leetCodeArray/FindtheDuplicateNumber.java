package leetCodeArray;

public class FindtheDuplicateNumber {

    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        for (int j = i + 1; j <= nums.length - 1; j++) {
            if (nums[i] == nums[j]) {
                return nums[i];
            } else {
                if (j == nums.length - 1) {
                    i++;
                    j = i;
                }
            }
        }
        return 0;
    }
}
