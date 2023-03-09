package day_23_breakAndContinue;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        int n1 = 5;
        int n2 = 7;
        int n3 = 10;

        //assign to the first element in the array value of n1
        numbers[0]=n1;
        numbers[1]=n2;
        numbers[2]=n3;

        numbers[0]=7;
        numbers[1]=8;
        //we cannot provide different data type, we have to use data type of an array
        //number[2]="A";

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println("***********************************");

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }
    }
}
