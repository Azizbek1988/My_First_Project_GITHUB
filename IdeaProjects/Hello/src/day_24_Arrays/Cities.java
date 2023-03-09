package day_24_Arrays;

public class Cities {
    public static void main(String[] args) {
        String[]  cities = {"Washington D.C","Kiev","Annandale","Tashkent","Baku","Istanbul","miami","Silver Spring","Mclean"};
        System.out.println(cities.length);

        //IASK print all cities that start with M
        for(int i = 0; i < cities.length; i++){
            if(cities[i].startsWith("T")){
                System.out.println(cities[i]);
            }
        }
        //same thing, with for each loop
        for(String city: cities){
            if(city.toUpperCase().startsWith("M")){
                System.out.println(city);
            }
        }
    }
}
