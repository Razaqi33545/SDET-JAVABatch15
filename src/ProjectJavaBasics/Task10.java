package ProjectJavaBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        /*
        Write a java program to find the second-largest number in the array?
         */

       int arr [] = {1, 3, 7, 5, 8, 2, 6, 10};

       int n = arr.length;

       Arrays.sort(arr);

        System.out.println("Second highest number is " +arr[n-2]);
    }
}
