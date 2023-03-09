package day_20;

public class PrintEachChar {
    public static void main(String[] args) {
        String word = "Amazon";
        //using for loop, print each char one by one
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        //using for loop, print only vowel (a,e,o,i,u)
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.toLowerCase().charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
                System.out.print(letter + ", ");
            }
        }
        //using for loop, print only consonants
        System.out.println();
        for(int i = 0; i < word.length(); i++) {
            char letter = word.toLowerCase().charAt(i);
            if (!(letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i'|| letter == 'u')) {
                System.out.print(letter + ", ");

            }
        }
    }
}
