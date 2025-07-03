package leetCodeArray;

public class plusOne {

        public static int[] plusone(int[] digits) {
            if(digits.length==0){
                return new int[] {0};
            }
            int n=digits.length;
            for(int i=n-1;i>=0;i--) {
                if(digits[i]<9) {
                    digits[i]++;
                    return digits;
                }
                // If the digit is 9, set it to 0 (carry over)
                digits[i]=0;
            }
            // If all digits were 9, we need an extra place for the carry
            int[] newNumber=new int[n+1];
            newNumber[0]=1;
            return newNumber;
        }
        public static void main(String[] args) {
		int[] arr= {1,9};
//		int[] arr1=plusone(arr);
//            int[] arr= {1,2,3};
 //           int[] arr={1,2,9};
            plusone(arr);
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
        }


    }


