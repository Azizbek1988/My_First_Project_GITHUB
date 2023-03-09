package day_31_MethodsWithParams;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
      countUp(10);// num = 10;
      countUp(7);// num = 7;
        countUp(0);
        countDown(5);
        countDown(0);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to countUp:");
        //get number from keyboard
        int inputNum = scan.nextInt();
        //call countUp method and set it as input
        countUp(inputNum);
    }
    public static void countUp(int num){
        if(num < 1){
            System.out.println("Invalid input - "+num);
        }else {

        }
        for(int i = 1; i <= num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void countDown(int num){
        if(num < 1){
            System.out.println("Invalid input "+num);
        }else{

        }
        for(int n = num; n >= 1; n--) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
