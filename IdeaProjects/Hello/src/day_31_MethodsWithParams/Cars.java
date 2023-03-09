package day_31_MethodsWithParams;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car name:");
        String car = scan.next();
        System.out.println("What is the speed:");
        int speed = scan.nextInt();

        drive(car,speed);
    }
    public static void drive(String car, int speed){
        System.out.println(car+" is driving "+speed+" mph");
    }
}
