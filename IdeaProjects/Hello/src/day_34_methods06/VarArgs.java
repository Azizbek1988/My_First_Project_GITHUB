package day_34_methods06;
import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
       printWords("red","blue","yellow");//3 values
       printWords("grey");
       printWords();//empty.so array will be empty array.
       String[] myPets = {"cat", "horse","dog","sheep","goat"};
        printWords(myPets);
        System.out.println(sum(3,5,10));
        cook("Burrito Bowl","Rice","Beans","Meat","Sour Cream");
        cook("Avocado Toast","Avoca-do","Sunny Side eggs","Wheat bread");
        shoppingList(1000,"Avocado Toast","Swatch watch watch Watch","Shoes");

        int budget = 200;
        if (sum(10,45,110,30) <= budget) {
            System.out.println("Within budget");
        }else {
            System.out.println("Broke");
        }
        int total = sum(234,43,567,12,34,5);
        System.out.println("Total: "+total);
    }
    public static void printWords(String... words ) {
        //handle it like an ARRAY
        for(String w: words) {
            System.out.println(w);
        }
    }
    /*
    sum(10,30,40); ==> 80
    sum(30,40,); ==> 70
     */
    public static int sum(int...nums) {
        int sum = 0;
        for(int n: nums) {
            sum+=n;//sum = sum + n
        }
        return sum;
    }
    public static void cook(String name, String... ings ) {
        System.out.print("Food: "+name);
        System.out.println(Arrays.toString(ings));
    }
    //shoppingList(1000,"Avocado Toast","Swatch watch watch Watch","Shoes");
    public static void shoppingList(int totalPrice, String... items){
        System.out.println("Total cost: "+totalPrice);
        System.out.println(Arrays.toString(items));

    }

}

