package ArrayPrograms;

public class removeDuplicatesInSortedArray {

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        removeDuplicatesInSortedArray duplicatesInSortedArray=new
                removeDuplicatesInSortedArray();
        int res=duplicatesInSortedArray.remove(arr);

        for (int i = 0; i< res; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int remove(int[]arr){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
