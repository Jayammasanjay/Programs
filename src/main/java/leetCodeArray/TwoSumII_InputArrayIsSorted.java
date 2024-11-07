package leetCodeArray;

public class TwoSumII_InputArrayIsSorted {
    public static void main(String[] args) {
int[] arr={2,7,11,15};
int target=9;
int[] res=twoSum(arr,target);
for (int i=0;i<res.length;i++){
    System.out.print(res[i]+" ");
}
    }
    public static int[] twoSum(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return new int[] {i+1,j+1};
            }
            else if(sum>target){
                j--;
            }else {
                i++;
            }

        }
        return new int[] {0};
    }
}
/*
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */
