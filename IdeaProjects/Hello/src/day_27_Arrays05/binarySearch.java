package day_27_Arrays05;

import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {4,6,7,10,55};
        System.out.println(Arrays.binarySearch(nums,10));//3
        System.out.println(Arrays.binarySearch(nums,55));//4
        System.out.println(Arrays.binarySearch(nums,5));//-2

        int i = Arrays.binarySearch(nums,10);
        System.out.println(i);
    }
}