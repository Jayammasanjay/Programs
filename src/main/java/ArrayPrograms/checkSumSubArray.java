package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class checkSumSubArray {
    public static void main(String[] args) {
int[] arr={2,8,2,6,-6,3,2};
int k=5;
        System.out.println(check(arr,k));
    }
    public static boolean check(int[] arr,int value){
        Set<Integer> set=new HashSet<>();
        set.add(0);
        int sum=0;
        for(int n:arr){
            sum+=n;
            int rem=sum-value;
            if(set.contains(rem)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
//if i find the sum which is already there in set
// which means i already find the subarray which form the value
/*
1)sum=0                                             3)sum=10
0+2=2                                                   10+2=12
sum=2                                               sum=12
rem=2-5                                             rem=12-5=7
check in set if rem contains return true            check in set if rem contains return true
set={2}                                             set={2,10,12}

2)sum=2
2+8=10
sum=10
rem=10-5
check in set if rem contains return true
set={2,10}

 */