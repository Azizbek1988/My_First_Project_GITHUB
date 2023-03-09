package day_23_breakAndContinue;

public class Print5RowsLetter {
    public static void main(String[] args) {
        //outer loop will repeat printing of letter as many times as want
        //in this case we are gonna print 3 times
        //so we are running inner loop 3 times
        for(int n = 1; n < 3; n++){
            //if index is even(2,4,6 etc), print from a to z
            if(n % 2 == 0) {
                for (char letter = 'a'; letter <= 'z'; letter++) {
                    System.out.print(letter + ",");
                }
                //if index is odd(1,3,5 etc), print from z to a
            }else {
                for(char letter = 'z'; letter>= 'a'; letter--){
                    System.out.print(letter+",");
                }
            }
            System.out.println();
            System.out.println("****************************************************");

        }
    }
}