package leetCodeArray;

public class MaximumSubArray {
    //leetcode 53. Maximum sum of Subarray
    public static void main(String[] args) {
//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={-2,-5,6,-2,-3,1,5,6};
        System.out.println(max(nums));
    }
    public static int max(int[] arr){
        int max=arr[0];int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }

return max;
    }
}
