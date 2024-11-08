package ArrayPrograms;

public class printAllSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        printSub(arr);
    }
    public static void printSub(int[] arr){
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j<=arr.length;j++){
                for (int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
