package ArrayPrograms;

import java.util.Scanner;

public class findMax {
    public static int element(int arr[])
    {
        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];

            }
        }


        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int ar[]=new int [size];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(element(ar));


    }
}
