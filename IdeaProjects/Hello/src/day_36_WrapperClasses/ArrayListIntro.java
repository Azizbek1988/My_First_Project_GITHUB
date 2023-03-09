package day_36_WrapperClasses;
import java.util.ArrayList;
import java.util.ArrayList.*;
public class ArrayListIntro {
    public static void main(String[] args) {
        //Create an arraylist
        String[] str = new String[5];
        ArrayList <String> names = new ArrayList<>();

        int[] numsArray = new int [5];
        ArrayList <Integer> nums = new ArrayList<>();

        //how to assign value into arraylist
        names.add("Roman");
        names.add("Orkhan");
        names.add("Vlad");
        names.add("Olimjon");
        names.add("Natalia");
        names.add("Maria");

        nums.add(100);
        nums.add(99);
        nums.add(656);
        nums.add(8566);
        //read from arraylist

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(nums.get(0));


        System.out.println("Names count: "+names.size());
        System.out.println("Nums count: "+nums.size());
    }
}
