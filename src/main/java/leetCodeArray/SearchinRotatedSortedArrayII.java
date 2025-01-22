package leetCodeArray;

public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {

       // int[] nums = {2,5,6,0,0,1,2};
        int[] nums={2,5,6,0,0,1,2};
         int target = 3;
        boolean res=find(nums,target);
        System.out.println(res);
    }
    public static boolean find(int[] arr,int target){
        int left=0,right=arr.length-1;
        while(left<=right){
           int mid=left+(right-left)/2;
           if(arr[mid]==target){
               return true;
           }
            // Handle duplicates: move `left` and `right` if they are the same as `mid`
           if(arr[left]==arr[mid] && arr[right]==arr[mid]){
               left++;
               right--;
           }
           else if (arr[left]<=arr[mid]){
               if(arr[left]<=target && target<arr[mid]){
                   right=mid-1;
               }else {
                   left=mid+1;
               }
           }
           else{
               if(arr[mid]<target && target<=arr[right]){
                   left=mid+1;
               }else {
                   right=mid-1;
               }
           }
        }
        return false;
    }
}
