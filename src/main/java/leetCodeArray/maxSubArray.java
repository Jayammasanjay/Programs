package leetCodeArray;

public class maxSubArray {

    public static void main(String[] args) {

        int[] arr={2,9,31,-4,21,7};
        int k=3;
        int res=findMaxSub(arr,k);
        System.out.println(res);
    }
    public static int findMaxSub(int[] arr,int k){
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }

        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            max=Math.max(max,sum);
        }

        return max;
    }
}
