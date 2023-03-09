package day_22_loopsPractice2;

public class CatsAndDogs {
    public static void main(String[] args) {
        String str = "mycatyourcat";

        //count how many cats
        int cats = 0;
        for(int n = 0; n <= str.length()-3; n++){
           // System.out.println(str.substring(n, n+3));
            if(str.substring(n, n +3).equals("cat")) {
                cats++;
            }
        }
        System.out.println("Cats: "+cats);
    }
}
