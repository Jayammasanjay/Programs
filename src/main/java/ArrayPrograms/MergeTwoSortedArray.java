package ArrayPrograms;


import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int n1=sc.nextInt();
        int[] ar1=new int[n1];
        for(int i=0;i<ar1.length;i++)
        {
            ar1[i]=sc.nextInt();
        }

        int[] res=merge(arr, ar1);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }

    public static int[] merge(int[] arr,int[] ar1)
    {
        int[] res=new int[arr.length+ar1.length];


        int i=0,j=0,k=0;

        while(i<arr.length && j<ar1.length)
        {
            if(arr[i]<=ar1[j])
            {
                res[k]=arr[i];
                k++;
                i++;
            }
            else
            {
                res[k++]=ar1[j++];
//				k++;
//				j++;
            }
        }
        while(i<arr.length)
        {
            res[k++]=arr[i++];
        }
        while(j<ar1.length)
        {
            res[k++]=ar1[j++];
        }
        return res;
    }
}
