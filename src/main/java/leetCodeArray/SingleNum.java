package leetCodeArray;

public class SingleNum {
    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single=single^num;  // XOR all numbers
        }
        return single;
    }

    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        int res=singleNumber(arr);
        System.out.println(res);
    }
}
