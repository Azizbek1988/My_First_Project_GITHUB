package day_30_methods;

import java.util.Scanner;

public class WarmUpMethods {
    public static void main(String[] args) {
        print5Stars();// call the method
        // call print5Starts 100 times
        for (int i = 1; i < 100; i++) {
            print5Stars();
        }
        introduce();
        introduce();
    }
    public static void print5Stars(){
        System.out.println("*****");
    }
    /*
    method name: introduce()
    params/args: nothing
    return type: void
    it will ask for a name and say Nice to meet you
     */

    public static void introduce() {
        Scanner scan = new Scanner(System.in);
        System.out.println("WHAT IS YOUR NAME?");
        String name = scan.next();
        System.out.println("Nice to meet you, "+name+"!");
    }
}
