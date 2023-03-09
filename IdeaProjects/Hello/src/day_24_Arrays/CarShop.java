package day_24_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CarShop {
    public static void main(String[] args) {
        // BMW, Audi, Ford, Honda, Mercedes, Mercury, Bentley, Tesla
        //1 step. create an array of string, and store these cars inside that array.

        String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
        //2 step: Print car names that starts with M
        for(String str: cars){
            if(str.toLowerCase().startsWith("m")) {
                continue;
            }
                System.out.println(str);

            }
            System.out.println("#######################");
            //3 step: Print all cars that have letter "r" somewhere in the name
            //please make your search case insensitive
            for(String str1: cars){
                if(str1.toLowerCase().contains("r")){
                    System.out.println(str1);

                }
            }
        System.out.println("#########################");
            //4 step: Print car names that ends with a
        for(String str2: cars){
            if(str2.toLowerCase().endsWith("a")){
                System.out.println(str2);

            }
        }
        System.out.println("****************************");
        //5 step: Print all cars that have at least 6 letters in the name
        for(String a: cars){
            if(a.length()>5){
                System.out.println(a);
            }
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for(int i = 0;i < cars.length; i++){
            if(cars[i].length()>=6){
                System.out.println(cars[i]);
            }
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        //step 6: Swap first and value in the array,
        //create a temp variable, that will get a value of first element
        String temp = cars[0];
        //we swap values of first and last  element of array
        cars[0] = cars[cars.length-1];
        //since temp variable has value of first element of array
        //we assign this value to the last element in the array
        cars[cars.length-1] = temp;
        //before sorting
        System.out.println(Arrays.toString(cars));
        //after sorting
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        System.out.println("Position: "+Arrays.binarySearch(cars,"Ford"));
        int num = Arrays.binarySearch(cars,"Ford");
        System.out.println("Position: "+Arrays.binarySearch(cars,num+1,cars.length-1,"Ford"));
        }
        }



