package leetCodeArray;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
//    int[] arr={1,1,1};
//    int k=2;
        int[] arr={2,8,2,6,-6,3,2};
        int k=5;
        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int res=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            res= res + map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
/*
Iteration Details:
Index	Num	Sum	Sum-K	Map (Before)	Res	Explanation
0	2	2	-3	{0=1}	0	No sum-k in map. Add sum=2 to map.
1	8	10	5	{0=1, 2=1}	0	No sum-k in map. Add sum=10 to map.
2	2	12	7	{0=1, 2=1, 10=1}	0	No sum-k in map. Add sum=12 to map.
3	6	18	13	{0=1, 2=1, 10=1, 12=1}	0	No sum-k in map. Add sum=18 to map.
4	-6	12	7	{0=1, 2=1, 10=1, 12=1, 18=1}	0	No sum-k in map. Update count of sum=12.
5	3	15	10	{0=1, 2=1, 10=1, 12=2, 18=1}	1	sum-k=10 exists in map. Add 1 to res.
6	2	17	12	{0=1, 2=1, 10=1, 12=2, 15=1}	3	sum-k=12 exists twice. Add 2 to res.

res = 3

Explanation: The subarrays with sum k = 5 are:

[6, -6, 3, 2] (indices 3 to 6)
[3, 2] (indices 5 to 6)
[2, 6, -6, 3] (indices 2 to 5)
sum:

This is the running total (cumulative sum) as we iterate over the array.
For example, if nums = [2, 8, 2], the cumulative sum as we process each element is:
sum = 2 after processing 2
sum = 10 after processing 8
sum = 12 after processing the second 2
sum - k:

This represents the difference between the current cumulative sum and the target sum k.
If there exists a previous sum sum - k, it means there is a subarray between that previous
 sum and the current position whose sum is exactly k.
Example:
If sum = 10 and k = 5, then sum - k = 5.
We check if 5 has occurred as a previous cumulative sum. If it has,
it means there are subarrays that sum to 5 from a previous index,
and the current subarray will have a sum of k = 5.

map.getOrDefault(sum - k, 0):

map.get(sum - k): This attempts to retrieve how many times sum - k
has occurred as a previous cumulative sum (from the map).
getOrDefault(sum - k, 0): If sum - k is not found in the map,
 it returns 0, meaning there are no subarrays ending at the current index that sum to k.
This is how we handle the case where there is no previous cumulative sum that satisfies sum - k.
res = res + map.getOrDefault(sum - k, 0):

This adds to the result (res) the count of subarrays that end at
 the current index and have a sum of k.
The value returned by getOrDefault(sum - k, 0) is the number of times
 sum - k has appeared previously as a cumulative sum. This is exactly the number of
 subarrays that sum to k ending at the current index.
 */