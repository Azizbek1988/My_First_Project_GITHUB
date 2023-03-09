package day_23_breakAndContinue;

public class PrintNumbersWithLoopTrianfle {
    public static void main(String[] args) {
        //outer loop
        for (int n = 1; n <= 10; n++) {
            //inner loop
            for (int i = 1; i <= n; i++) {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}