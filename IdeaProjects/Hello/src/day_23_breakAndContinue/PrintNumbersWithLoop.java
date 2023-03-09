package day_23_breakAndContinue;

public class PrintNumbersWithLoop {
    public static void main(String[] args) {
        //this is just to print numbers from 1 to 10
        //for(int n = 0; n <= 10; n++){
        //System.out.print(n+" ");
        //outer loop
        for (int k = 1; k <= 3; k++) {
            for (int j = 1; j <= 2; j++) {
                //inner loop
                for (int n = 1; n <= 10; n++) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }
            System.out.println("*********************");
        }
    }
}