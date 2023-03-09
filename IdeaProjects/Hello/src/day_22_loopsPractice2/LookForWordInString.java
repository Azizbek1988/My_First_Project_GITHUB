package day_22_loopsPractice2;

public class LookForWordInString {
    public static void main(String[] args) {
        String sentence = "He said hi, then she replied hi. hi guys!";
        //print letters in pairs
        //He
        //e
        // s
        //a
        //check if temp equals "hi", if true, add 1 to it
        int count = 0;
        for(int n = 0; n< sentence.length()-1; n++){
            String temp = sentence.substring(n, n+2);
            //System.out.println(temp);
            if(temp.equals("hi")){
                count++;
            }


        }
        //Count: 3
        System.out.println("Count: "+count);


    }
}
