package day_32_methodsWithArrays;

import java.sql.SQLOutput;

public class Cooking {
    public static void main(String[] args) {

        makePancakes();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        makePasta();
        cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
    }
    public static void cook(String dish, String ingredient){
        System.out.println("###"+dish.toUpperCase()+"RECIPE###");
        add(ingredient);
        System.out.println("Cook it untill it is cooked");
        System.out.println("###"+dish.toUpperCase()+" IS READY");
        //we could also check value of dish and call matching method
        //if(dish.equals("pancakes")) {
          //  makePancakes();
        //}
    }
    public static void makePasta(){
        System.out.println("###ITALIAN PASTA RECIPE###");
        add("Water, Salt, Olive oil");
        boil(2);
        add("Spagetti Pasta");
        boil(9);
        mix(60);
        add("Parmesan cheese, Mariana");
        System.out.println("###DELICIOUS PASTA IS READY###");
    }
    public static void makePancakes(){
        System.out.println("####PANCAKES RECIPE####");
        add("Milk, Eggs, Flour, Salt");
        mix(120);
        fry(3);
        System.out.println("###ENJOY YOUR DELICIOUS PANCAKES###");
    }
    public static void add(String ing){
        System.out.println("Add "+ing);
    }
    public static void mix(int seconds){
        System.out.println("Mix for "+seconds+" seconds");
    }
    public static void fry(int minutes){
        System.out.println("Fry for "+minutes+ " minutes");
    }
    public static void boil(int minutes){
        System.out.println("Boil it for "+minutes+" minutes");
    }
}
