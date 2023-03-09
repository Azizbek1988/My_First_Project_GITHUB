package day_31_MethodsWithParams;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        //add, substract, multiply, divide, remainder
    add(5,5);
    substact(1500,4000);
    multiply(1200,50);
    divide(1000,25);
    remainder(15,4);
    divide(2,0);
    //using scanner pass 2 numbers and operator
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Select operation: '+', '-', '*', '/', '%' ");
        String operator = scan.next();

        //using switch statement call the maiching method to perform calculation
        switch(operator) {
            case "+":
                add(n1, n2);
                break;
            case "-":
                substact(n1, n2);
                break;
            case "*":
                multiply(n1,n2);
                break;
            case "/":
                divide(n1, n2);
                break;
            case "%":
                remainder(n1, n2);
                break;
            default:
                System.out.println("Invalid operator.");
        }
        }
    public static void add(double num1, double num2){
        double result = num1 + num2;
        System.out.println("Result: "+result);
    }
    public static void substact(double num1,double num2){
        double result = num1 - num2;
        System.out.println("Result: "+result);
    }
    public static void multiply(double num1, double num2){
        double result = num1 * num2;
        System.out.println("Result: "+result);
    }
    public static void divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("cannot/by zero");
            return;//exit the method here, do not run the rest
        }
        double result = num1 / num2;
        System.out.println("Result: "+result);
    }
    public static void remainder(double num1, double num2){
        double result = num1 % num2;
        System.out.println("Result: "+result);
    }
}

