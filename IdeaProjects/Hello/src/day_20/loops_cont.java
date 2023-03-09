package day_20;

import java.util.Scanner;

public class loops_cont {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int inhabitant = scan.nextInt();
       int day = 0;
       while(inhabitant>0){
           System.out.println("Day "+day+ "[" + inhabitant+"]");
           day++;
           inhabitant = inhabitant/2; //decrease by half
       }
        System.out.println("------EXTINCT------");
    }
}
