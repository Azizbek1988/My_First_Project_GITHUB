package day_34_methods06;

public class CountArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
        //1. with print return right away
        System.out.println(findOccurences(nums,5));
        System.out.println(findOccurences(nums,6));
        //2. assign return value into a variable
        int fives = findOccurences(nums,5);
        System.out.println("5 values: "+fives);

        if(fives > 0) {
            System.out.println("We have 5s");
        }else {
            System.out.println("No 5s");
        }
        if(findOccurences(nums,2) > 0) {
            System.out.println("We have 2s");
        }else {
            System.out.println("No 2s");
        }
        // create array and pass to method
       int twenty = findOccurences(new int[] {10,20,20,30,55,22},20);
        System.out.println("Twenty: "+twenty);
    }
    public static int findOccurences(int[] array,int value) {
        int counter = 0;

        for(int num: array) {
            if(num == value) {
                counter++;
            }
        }
        return counter;
    }
    public static int[] getArray(){
        int[] retArray = {45,43,11,545,1000};
        return retArray;
    }
}
