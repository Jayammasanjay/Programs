package ArrayPrograms;
//Finds the indix of the second largest element
public class secondLargest {
    public static int second(int arr[])
    {
        int n=arr.length;
        int res=-1,largest=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                res=largest;
                largest=i;
            }
            else if(arr[i]!=largest && arr[i]>res )
            {

                res=i;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int ar[]= {23,40,50,33,56,67,78};
        System.out.println(second(ar));
    }
}
