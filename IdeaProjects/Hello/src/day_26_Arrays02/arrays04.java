package day_26_Arrays02;

import java.util.Arrays;

public class arrays04 {
    public static void main(String[] args) {
        String words = "java,kava,html,selenium";
        String[] wordsArray = words.split(",");
        System.out.println("Count: " + wordsArray.length);
        System.out.println(wordsArray[0]);
        System.out.println();
        System.out.println(Arrays.toString(wordsArray));

        for (String word : wordsArray) {
            System.out.println(word);
        }
        String abc = "1 - 020 of 1,461 positions";
        //using split method, print 1,461
        String[] abc1 = abc.split(" ");
        System.out.println("Search result total: " + abc1[4]);
    }
}
