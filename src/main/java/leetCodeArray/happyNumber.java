package leetCodeArray;

import java.util.HashSet;
import java.util.Set;

public class happyNumber {
    public static void main(String[] args) {
        int n=19;
        System.out.println(check(n));

    }
    public static boolean check(int n){
        Set<Integer> set=new HashSet<>();
        while(true){
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,2);//remainder
                n=n/10;//quotient
            }
            if(sum==1) return true;
            n=sum;
            if(set.contains(sum)) return false;
            set.add(sum);
        }
    }
}
