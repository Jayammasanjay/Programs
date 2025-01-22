package leetCodeArray;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
int[] arr={2,3,1,2,4,3};int target=7;
        System.out.println(minSubArrayLen(target,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,window=0,ans=n+1,left=0;
        for(int right=0;right<n;right++){
            window=window+nums[right];
            while(window>=target){
                ans=Math.min(ans,right-left+1);
                window=window-nums[left++];
            }
        }
        return ans==n+1? 0 : ans;
    }
}
