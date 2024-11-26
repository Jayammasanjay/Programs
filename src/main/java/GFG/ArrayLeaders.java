package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLeaders {

    public static void main(String[] args) {
        int[] arr={16, 17, 4, 3, 5, 2};
        List<Integer>res=leaders(arr);
        System.out.println(res);

    }
    public static List<Integer> leaders(int[] arr){
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        int curr_leader=arr[n-1];
        list.add(curr_leader);
        for (int i=n-2;i>=0;i--){
            if(arr[i]>=curr_leader){
                curr_leader=arr[i];
                list.add(curr_leader);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
