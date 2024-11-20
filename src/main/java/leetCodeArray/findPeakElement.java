package leetCodeArray;

public class findPeakElement {

    public static void main(String[] args) {
    //it will return the index of the peak
        int[] arr={1,2,1,3,5,6,4};
        //int[] arr={1,2};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr){
        int left=0,right=arr.length-1;

        while (left<right){
            int mid=(left+right)/2;

            boolean leftIsSmaller=((mid==0) || (arr[mid-1]<arr[mid]));
            boolean rightIsSmaller=((mid==arr.length-1) || (arr[mid]>arr[mid+1]));
            if(leftIsSmaller && rightIsSmaller){
                return mid;
            }
            else if((mid<arr.length-1) && (arr[mid]<arr[mid+1])){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
}
