package day_30_methods;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
    public static void main(String[] args) {
        showMe5Numbers();
        doPush10Ups();
        rangePrint();
    }


        /*
        method name: showMe5Numbers
        return type: void
        params:no
        print 5 random numbers 0, 1000
        in same line separated by comma
        Ex:
        showMe5Numbers(); 345,234,566,2,23
         */
        public static void showMe5Numbers() {
            Random r = new Random();
            for(int i = 1; i <= 5; i++){
                System.out.print(r.nextInt(1001)+" ");//print random num 0-1000

            }
            System.out.println();// take it to next line


            }
            public static void doPush10Ups(){
            /*
            name: doPush10Ups
            return type: void
            params: no
            print:
            Pushup - 1
             Pushup - 2
              Pushup - 3
               Pushup - 4
                Pushup - ....0
                 Pushup - 1
                 Time to rest
             */
                for(int j = 1; j <= 10; j++) {
                    System.out.println("Pushup - "+j);
                }
                System.out.println("Time to rest");
        }
        public static void rangePrint(){
            /*
            method name: rangePrint
            return type: void
            params/args: no
            Using scanner ask for 2 integers.
            You need to print all numbers between those numbers.
            Ex:
            rangePrint();
            5
            8
            5 6 7 8
            or
            8
            5
            8 7 6 5
             */
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter 2 numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if(num1 < num2){
                for(int i = num1; i <= num2; i++) {
                    System.out.print(i+" ");
                }
            }else if(num1 > num2) {
                for(int k = num1; k >= num2; k--) {
                    System.out.print(k+" ");
                }
            }else{
                System.out.println(num1);
            }
            System.out.println();
        }
}
