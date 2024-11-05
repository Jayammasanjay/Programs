package leetCodeArray;

public class MajorityElement {
//time o(n) space O(1)
    public static void main(String[] args) {
        int[] arr={3,2,3,1,1,1};
        System.out.println(findMajority(arr));
    }

    public static int findMajority(int[] arr){
        int candidate=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }else {
                count--;
            }
        }

        return candidate;
    }
}
