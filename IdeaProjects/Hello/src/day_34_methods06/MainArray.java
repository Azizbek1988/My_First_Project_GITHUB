package day_34_methods06;
import java.util.*;
public class MainArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountArray.getArray()));
        // store return value into Array
        int[] nums = CountArray.getArray();
        System.out.println(Arrays.toString(nums));

        // for(;;) { //while (true) ==*> both are infinite loop
        System.out.println(Arrays.toString(getRandomArray(10)));
        int[] randomNums = getRandomArray(3);
        System.out.println(Arrays.toString(randomNums));
    //}
}
    /*
    Method name: getRandomArray
    return type: int[]
    Params: int size
    In the method create an Array with value of size.
    and assign random values from 0 - 100 and return it
     */
    public static int[] getRandomArray(int size) {
        Random rand = new Random();//create Random slass object
        int[] nums1 = new int[size];//declare array with size number of elements
        for(int i = 0; i < size; i++) {
            nums1[i] = rand.nextInt(101);//get random number and assign to array index
        }
        return nums1;
    }
}
