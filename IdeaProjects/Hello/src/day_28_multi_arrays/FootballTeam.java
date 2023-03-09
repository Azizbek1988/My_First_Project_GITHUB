package day_28_multi_arrays;

import java.util.Arrays;

public class FootballTeam {
    public static void main(String[] args) {
        String[][] teams = new String[2][6];
        // "Irina","Zarif","Cihan","Habib","Adel","Bojan";
        // "Olimjon","Mirshod","Usman","Nursultan","Roman","Dmitriy";


        //declare MultiD array with 2 rows and 6 column
        teams[0][0] = "Irina";
        teams[0][1] = "Zarif";
        teams[0][2] = "Cihan";
        teams[0][3] = "Habib";
        teams[0][4] = "Adel";
        teams[0][5] = "Bojan";

        teams[1][0] = "Olimjon";
        teams[1][1] = "Mirshod";
        teams[1][2] = "Usman";
        teams[1][3] = "Nursultan";
        teams[1][4] = "Roman";
        teams[1][5] = "Dmitriy";

        System.out.println("First player of first team: ");
        System.out.println(teams[0][0]);//Irina
        System.out.println(teams[0][3]);//Habib
        System.out.println(teams[1][5]);//Dmitriy

        //print how many rows/teams/arrays
        System.out.println("Number of rows: " + teams.length);
        System.out.println("People of in first team: " + teams[0].length);
        System.out.println("People of in second team: " + teams[1].length);

        System.out.println(Arrays.deepToString(teams));

        int nums[][] = new int[3][4];

        nums[0][0] = 100;
        nums[0][1] = 34534;
        nums[0][2] = 343242;
        nums[0][3] = 773546;

        nums[1][0] = 246;
        nums[1][1] = 20504;
        nums[1][2] = 343242;
        nums[1][3] = 256;

        nums[2][0] = 400;
        nums[2][1] = 30000;
        nums[2][2] = 5500;
        nums[2][3] = 2500;

        System.out.println(Arrays.deepToString(nums));
        System.out.println(Arrays.toString(nums[0]));


        int[][] scores = {{3, 5, 10}, {6, 4, 2}};

        System.out.println("Number of arrays: " + scores.length);
        System.out.println("Number of values in 1: " + scores[0].length);
        System.out.println("Number of values in 2: " + scores[1].length);

        int[][] values = new int[4][];
        values[0] = new int[]{34, 23, 5};
        values[1] = new int[]{34,45,6,5,34,2,2,43,45,56,567,3};

        values[2] = new int[2];
        values[2][0] = 55;
        values[2][1] = 88;

        values[3] = new int[]{5,12,45,77,34};

        System.out.println(Arrays.deepToString(values));
    }
}
