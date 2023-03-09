package day_38_arraylist03;
import java.util.*;
public class CollectionSorting {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(44);
        numList.add(1);
        numList.add(4);
        numList.add(1000);
        numList.add(3);
        System.out.println(numList);

        System.out.println("Sorting...please wait...");
        Collections.sort(numList);

        System.out.println(numList);

        List<String> strList = new ArrayList<>();
        strList.add("Fuad");
        strList.add("Roman");
        strList.add("Murad");
        strList.add("Muhabbat");
        strList.add("Maria");
        strList.add("Dina");
        strList.add("Bojan");
        strList.add("Anastasia");
        strList.add("Yaroslav");

        System.out.println(strList);
        System.out.println("Sorting...please wait...");
        Collections.sort(strList);
        System.out.println(strList);

        //MAX, MIN
        int maxNum = Collections.max(numList);
        int minNum = Collections.min(numList);

        System.out.println("maxNum: "+maxNum);
        System.out.println("minNum: "+minNum);

        String maxName = Collections.max(strList);
        String minName = Collections.min(strList);

        System.out.println("maxName: "+maxName);
        System.out.println("minName: "+minName);

        Collections.shuffle(strList);
        System.out.println(strList);
    }
}
