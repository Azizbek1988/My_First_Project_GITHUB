package day_22_loopsPractice2;

public class LookForError {
    public static void main(String[] args) {
        //look for error, and print count
        //for loop, substring, if statement
        String log = "f;lgkbn;slkdfgbn;errordlfkmbsld;kfmberrormv'errorsd;flmerrork'serrordl;errorkfmerrorsfv{}l;,x";
        // "This file has some errors in it."
        int count = 0;
        //error             stop loop 5 character before end
        for(int n = 0; n <= log.length()-5;n++){
            String temp = log.substring(n, n+5);
            //System.out.println(temp); It is also possible but it is easy way to do that
            if(temp.equals("error")) {
                count++;
            }
        }
        System.out.println("Count: "+count);
        if(count > 0){
            System.out.println("FAIL");
        }else {
            System.out.println("PASS");
        }

    }
}
