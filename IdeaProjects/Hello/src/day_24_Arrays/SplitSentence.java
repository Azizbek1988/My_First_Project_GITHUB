package day_24_Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        int counter = 0;
        String sentence = "Instead of declaring and initializing a loop counter variable, we\n" +
                "\tdeclare a variable that has the same type as the base type of the array.\n" +
                "\tIn the loop body, you can use the loop variable that you created rather than \n" +
                "\tusing index of element in the array.\n";
        String[] words = sentence.split(" ");
        for(String str: words) {
            if (str.equals("a")) {
                break;
            }
            counter++;
        }
            System.out.println("Position: "+counter);
            System.out.println(words[counter]);

        }

    }
