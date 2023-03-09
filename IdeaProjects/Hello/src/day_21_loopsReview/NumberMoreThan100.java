package day_21_loopsReview;

import java.util.Scanner;

public class NumberMoreThan100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int sum = 0;
        // int SumOfSums=0;
        do {
            System.out.println("Enter 2 numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            sum = num1 + num2;
            //SumOfSums += sum;
        }while(sum <=100);

        System.out.println("Good Numbers");



    }
}
