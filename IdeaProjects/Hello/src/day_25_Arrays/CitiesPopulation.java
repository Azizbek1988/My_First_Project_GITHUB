package day_25_Arrays;

public class CitiesPopulation {
    public static void main(String[] args) {
        int[] CitiesPopulation = new int[5];
        CitiesPopulation[0] = 5000;
        CitiesPopulation[1] = 10000;
        CitiesPopulation[2] = 7000;
        CitiesPopulation[3] = 4455;
        CitiesPopulation[4] = 8907;

        //int[] CitiesPopulation = {5000,10000,7000,4455,8907};

        System.out.println("City 1 population: "+CitiesPopulation[0]);
        System.out.println("City 2 population: "+CitiesPopulation[1]);
        System.out.println("City 3 population: "+CitiesPopulation[2]);
        System.out.println("City 4 population: "+CitiesPopulation[3]);
        System.out.println("City 5 population: "+CitiesPopulation[4]);

        int idx = 0;
        System.out.println("City 1 population: "+CitiesPopulation[idx]);

        idx++;
        System.out.println("City 2 population: "+CitiesPopulation[idx]);

        String str = "abc";                                    //3
        System.out.println("City STR.LENGTH: "+CitiesPopulation[str.length()]);

        System.out.println("############################################");
        String[] cities = {"Miami", "London","Tokyo","Rome","New York"};

        System.out.println("The population "+cities[0]+" is "+CitiesPopulation[0]);
        System.out.println("The population "+cities[1]+" is "+CitiesPopulation[1]);
        System.out.println("The population "+cities[2]+" is "+CitiesPopulation[2]);
        System.out.println("The population "+cities[3]+" is "+CitiesPopulation[3]);
        System.out.println("The population "+cities[4]+" is "+CitiesPopulation[4]);

    }
 }
