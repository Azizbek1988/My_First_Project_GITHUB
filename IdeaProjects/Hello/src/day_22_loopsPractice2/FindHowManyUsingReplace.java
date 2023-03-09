package day_22_loopsPractice2;

public class FindHowManyUsingReplace {
    public static void main(String[] args) {

        String word = "sfdvmlkmrrlksmdvlksmrrlkmlkm";
        //find how many r characters in the word.
        //get the length of word
        //replace all r with empty
        //get the length of word without r
        //do a minus

        int length1 = word.length();
        word = word.replace("r","");
        int length2 = word.length();

        System.out.println("Length1: "+length1);
        System.out.println("Length2: "+length2);

        int count = length1 - length2;
        System.out.println("Count of r: "+count);
    }
}
