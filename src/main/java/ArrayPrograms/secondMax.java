package ArrayPrograms;

public class secondMax {
    public static int check(int arr[])
    {
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstMax)
            {
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=firstMax)
            {
                secondMax=arr[i];
            }
        }

        return secondMax;
    }
    public static void main(String[] args) {
        int ar[]= {12,34,556,32,43,23,412};

        System.out.println(check(ar));
    }
}
