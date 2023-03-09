package day_29_method01;
import java.util.*;
public class Countries {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Washington DC"},
                {"Canada", "Ottawa"},
                {"Mexico", "Mexico city"},
                {"Brasil", "Brasilia"},
                {"Peru", "Lima"},
                {"Argentina", "Boanes Aeros"},
                {"Bolivia", "La Paz"},
                {"Macedonia", "Scopia"},
                {"Kazakhstan", "Nursultan"},

        };
        // String[][] c = String[9][2];
        //c[0][0] = "USA"; c[0][1] = "Washington DC";

        System.out.println(countries[0][1] + "|" + countries[0][1]);
        System.out.println(Arrays.deepToString(countries));

        //print all the countries in same line separated by |

        for (int i = 0; i < countries.length - 1; i++) {

            System.out.println(countries[i][0] + "|");
        }
        System.out.println("*****************************************88");
        //for each loop
        for (String[] country : countries) {
            System.out.print(country[0]+"|");
        }
        System.out.println();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //get all Cities and add to cities[] array
        //declare array and size needs to match countries Array size
        //String[] cities = new String[9];
        String[] cities = new String[countries.length];
        //null means no object. It is not same as empty string
        System.out.println(Arrays.toString(cities));

        for(int i = 0; i < countries.length;i++){
            cities[i] = countries[i][1];
        }
        System.out.println(Arrays.toString(cities));

        // Look for Bolivia in the countries and test if
        // capital city is "La Paz"

        for(int row = 0; row < countries.length; row++) {
            if(countries[row][0].equals("Bolivia")){

                //System.out.println(countries[row][1]);
                if(countries[row][1].equals("La Paz")){
                    System.out.println("Bolivia test passed");
                }else{
                    System.out.println("Bolivia test failed");
                }
                break;// exit the loop.
            }
        }
    }
}

