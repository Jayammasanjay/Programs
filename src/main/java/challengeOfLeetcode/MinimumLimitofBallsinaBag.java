package challengeOfLeetcode;

public class MinimumLimitofBallsinaBag {

    public static void main(String[] args) {
        int[] nums={9};
        int maxOperations = 2;
        System.out.println(minimumSize(nums,maxOperations));
    }

        private static boolean isPossible(int maxBallsInBag,int[] nums,int maxOperations){
            int totalOperations=0;
            for(int n:nums){
                int operations=(int)Math.ceil((double)n / maxBallsInBag)-1;
                totalOperations+=operations;
                if(totalOperations>maxOperations){
                    return false;
                }

            }
            return true;
        }
        public static int minimumSize(int[] nums, int maxOperations) {
            int l=1,r=0;
            for(int n:nums) r=Math.max(r,n);
            int ans=r;

            while(l<=r){
                int mid=(l+r)/2;
                if(isPossible(mid,nums,maxOperations)){
                    ans=mid;
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            return ans;
        }
    }

