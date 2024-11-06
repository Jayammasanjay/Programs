package leetCodeArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesInSortedArray2 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int res=removeDuplicate(arr);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int removeDuplicate(int[] arr) {
        int i=0;
        for(int n:arr){
            if(i<2 || n!=arr[i]){
                n=arr[i];
                i++;
            }
        }
       return i;
    }
}
