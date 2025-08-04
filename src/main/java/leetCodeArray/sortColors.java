package leetCodeArray;

public class sortColors {
    //leetcode 75 Dutch National Flag algorithm

    public static void main(String[] args) {
        int[] arr={0,2,1,2,0,1,2};
        sort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sort(int[] arr){
        int l=0,mid=0,h=arr.length-1;

        while(mid<=h){
            if(arr[mid]==0){
                swap(arr,l,mid);
                l++;mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else{
                swap(arr,mid,h);
                h--;
            }
        }
    }

    public static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
