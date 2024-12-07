package leetCodeString;
//541
public class reverseString2 {
    public static void main(String[] args) {

        String s="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));
    }
    public static void swap(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }

    }
    public static String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int i=0,n=arr.length;
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            swap(arr,i,j);
            i=i+2*k;
        }
        return new String(arr);
    }
}
