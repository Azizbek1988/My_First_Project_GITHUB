package day_39_ArrayListCoustomMethods;
import java.util.*;
public class WarmUpTask {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("USA");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");

        //FOR EACH:Print each city in same line separates by |
        for(String city: cities){
            System.out.print(city+" | ");
        }
        System.out.println();
        //FOR LOOP: Print each city in same line separated by |
        for(int i = 0; i < cities.size(); i++){
            System.out.print(cities.get(i)+" | ");

        }
        System.out.println();
        //3) ToString. Print each city all uppercase
        System.out.println(cities.toString().toUpperCase());
        System.out.println(cities);

        //Make each city all uppercase
        String paris = cities.get(0).toUpperCase();
        cities.set(0,paris);
        System.out.println(cities.get(0));

        cities.set(1,cities.get(1).toUpperCase());
        System.out.println(cities.get(1));

        for(int j = 0; j < cities.size(); j++) {
            String city = cities.get(j).toUpperCase();
            cities.set(j,city);
        }
        System.out.println(cities.toString());

        //Find the longest city.
        String longestCity = "", shortestCity = "";

        for(String city : cities ){
            if(city.length() > longestCity.length()){
                longestCity = city;
            }
        }
        shortestCity = cities.get(0);
        for(String city : cities) {
            if(city.length() < shortestCity.length()) {
                shortestCity = city;
            }
        }
        System.out.println("Longest City: "+longestCity);
        System.out.println("Shorter City: "+shortestCity);

        List<String> citiesMoreThan6 = new ArrayList<>();
        //assign all cities that have more than 6 chars to this Arraylist
        for(String ct: cities) {
            if(ct.length() > 6){
                citiesMoreThan6.add(ct);
            }
        }
        System.out.println(citiesMoreThan6);
    }
}
