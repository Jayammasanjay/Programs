package leetCodeArray;

public class maximum_SubArray {
    //gpt question and solution
    public static void main(String[] args) {
       // int[] arr={2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr={-2,-5,6,-2,-3,1,5,-6};
        System.out.println(max(arr));

    }
    private static int max(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int maxsum=Integer.MIN_VALUE;
        int left=0;
        for (int right=0;right<nums.length;right++){
            int currsum=0;
            for (int i=left;i<=right;i++){
                currsum=currsum+nums[i];
            }
            while (currsum<0 && left<=right){
                currsum=currsum-nums[left];
            }
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}
