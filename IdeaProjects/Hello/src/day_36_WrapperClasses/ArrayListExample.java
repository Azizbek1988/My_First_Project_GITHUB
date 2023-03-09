package day_36_WrapperClasses;
import java.util.ArrayList;
//import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        //declare arraylist called languages
        ArrayList <String> languages = new ArrayList<>();
        //add values
        languages.add("Java");
        languages.add("English");
        languages.add("Spanish");
        languages.add("Arabic");
        languages.add("Russian");
        languages.add("Azerbaijani");
        languages.add("Ukranian");

        System.out.println("Number of values: "+languages.size());
        languages.add("Turkish");
        System.out.println("Number of values: "+languages.size());

        //remove java
        languages.remove(0);
        System.out.println("Number of values: "+languages.size());

        System.out.println(languages.toString());
    }
}
