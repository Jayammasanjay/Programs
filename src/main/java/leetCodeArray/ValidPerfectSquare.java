package leetCodeArray;

public class ValidPerfectSquare {
    public static void main(String[] args) {
int num=16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num){
        int left=1,right=num;
        while(left<right){
            int mid=(left+right)/2;
            long square=mid*mid;
            if(num==square){
                return true;
            } else if (square>num) {
                right=mid-1;
            }else
                left=mid+1;
        }
        return false;
    }
}
