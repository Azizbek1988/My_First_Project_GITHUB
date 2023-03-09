package day_31_MethodsWithParams;

import java.util.Arrays;

public class MethodsWithStrings {
    public static void main(String[] args) {
    countWords("Java is fun");
    countWords("This is method with Strings");
    googleSearchResults("About 121,000,000 results (0.75 seconds)");

    String resultStr = "About 16,600,000 results (0.73 seconds)";
    googleSearchResults(resultStr);
    }
    public static void countWords(String sentence){
        String[] words = sentence.split(" ");
        System.out.println("Words in this sentence: "+ Arrays.toString(words));
        System.out.println("Number of words: "+words.length);
    }
    // googleSearchResults("About 121,000,000 results (0.75 seconds)");
    public static void googleSearchResults(String result) {
        //split by space
        String[] words = result.split(" ");
        String count = words[1].replace(",","");
                String seconds = words[3].replace("(", "");

        System.out.println("Result count: "+count);
        System.out.println("Time in second: "+seconds);
    }
}
