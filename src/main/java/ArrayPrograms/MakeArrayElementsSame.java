package ArrayPrograms;

import java.util.*;

public class MakeArrayElementsSame {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 2, 4}; // Example

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
        System.out.println(arr.length);
        int maxFreq = Collections.max(freq.values());
        System.out.println(maxFreq);
        int minOperations = arr.length - maxFreq;

        System.out.println("Minimum operations to make all elements same: " + minOperations);
    }
}
//import java.util.Arrays;
//
//public class MakeArrayElementsSame {
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 2, 3, 2, 4}; // Example
//
//        Arrays.sort(arr); // Sort array to group equal elements
//
//        int maxFreq = 1;
//        int currentFreq = 1;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i - 1]) {
//                currentFreq++;
//                maxFreq = Math.max(maxFreq, currentFreq);
//            } else {
//                currentFreq = 1;
//            }
//        }
//
//        int minOperations = arr.length - maxFreq;
//        System.out.println("Minimum operations to make all elements same: " + minOperations);
//    }
//}