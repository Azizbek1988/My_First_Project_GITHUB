package day_32_methodsWithArrays;

import java.util.Arrays;

public class ArrayParameters {
    public static void main(String[] args) {
    int[] myArray = {44,22,66,11};
    printArray(myArray);
    printArray(new int[]{33,45,5,7});
                int[] one = {10,2,3};
                int[] two = {3,1,4,323,100};
                print2Arrays(one,two);
        System.out.println("########################################");
                print2ArraysV2(one,two);
    }
    //version 2. We will call printArray method
    public static void print2ArraysV2(int[] arrNums1, int[] arrNums2){
        if(arrNums1.length > arrNums2.length){
            printArray(arrNums1);
            printArray(arrNums2);
        }else {
            printArray(arrNums2);
            printArray(arrNums1);
        }
    }
    public static void print2Arrays(int[] arrNums1, int[] arrNums2) {
            if(arrNums1.length > arrNums2.length) {

                System.out.println(Arrays.toString(arrNums1));
                System.out.println(Arrays.toString(arrNums2));
        }else{
            System.out.println(Arrays.toString(arrNums2));
            System.out.println(Arrays.toString(arrNums1));
        }

    }
    public static void printArray(int[] nums) {
        for(int n : nums) {
            System.out.println(n+" ");
        }
        System.out.println();
    }
}