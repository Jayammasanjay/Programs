package ArrayPrograms;

public class largestElementIndex {
    public static int check(int arr[])
    {
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[largest])
            {
                largest=i;
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int ar[]= {12,3,312,34,45};
        System.out.println(check(ar));
    }
}
